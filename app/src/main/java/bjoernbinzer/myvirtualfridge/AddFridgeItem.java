package bjoernbinzer.myvirtualfridge;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AddFridgeItem extends AppCompatActivity implements AddUomDialogFragment.Communicator {

    private EditText durability;
    private EditText uom;
    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    public OnDateSetListener listener;
    int calendar_year, calendar_month, calendar_day_of_month;
    Calendar c;
    private Spinner spinner;
    private ArrayAdapter adapter;
    public String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fridge_item);

        Intent intent = getIntent();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Insert user input into DB
                EditText editProduct = (EditText) findViewById(R.id.editText_product);
                String product = editProduct.getText().toString();
                EditText editDurability = (EditText) findViewById(R.id.editText_durability);
                String durability = editDurability.getText().toString();
                EditText editQuantity = (EditText) findViewById(R.id.editText_quantity);
                double quantity = Double.parseDouble(editQuantity.getText().toString());
                EditText editUom = (EditText) findViewById(R.id.editText_uom);
                String uom = editUom.getText().toString();
                EditText editPrice = (EditText) findViewById(R.id.editText_price);
                double price = Double.parseDouble(editPrice.getText().toString());
                Spinner spinnerCategory = (Spinner) findViewById(R.id.spinner_category);
                String category = spinnerCategory.getSelectedItem().toString();

                FridgeDB.insertEntry(product, durability, quantity, uom, price, category);

                finish();
            }
        });

        dateFormatter = new SimpleDateFormat("dd.MM.yyyy", Locale.GERMANY);
        Date date = new Date();
        durability = (EditText) findViewById(R.id.editText_durability);
        durability.setText(dateFormatter.format(date));
        durability.setInputType(InputType.TYPE_NULL);
        durability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatePickerDialog(view);
            }
        });

        uom = (EditText) findViewById(R.id.editText_uom);
        uom.setInputType(InputType.TYPE_NULL);
        uom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openUomPickerDialog(view);
            }
        });

        spinner = (Spinner) findViewById(R.id.spinner_category);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                category = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }

    public void openDatePickerDialog(View view) {
        c = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, listener = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                durability.setText(dateFormatter.format(newDate.getTime()));
            }
        }, calendar_year = c.get(Calendar.YEAR), calendar_month = c.get(Calendar.MONTH), calendar_day_of_month = c.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.getDatePicker().setSpinnersShown(false);
        datePickerDialog.getDatePicker().setCalendarViewShown(true);
        datePickerDialog.show();
    }

    public void openUomPickerDialog(View view) {
        FragmentManager manager = getFragmentManager();

        AddUomDialogFragment uomDialogFragment = new AddUomDialogFragment();
        uomDialogFragment.show(manager, "uomDialogFragment");
    }

    @Override
    public void onDialogMessage(String message) {
        uom.setText(message);
    }
}
