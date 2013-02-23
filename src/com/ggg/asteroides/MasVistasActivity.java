package com.ggg.asteroides;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MasVistasActivity extends Activity {

	private EditText entrada;
	private TextView salida;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.masvistas);

		entrada = (EditText) findViewById(R.id.entrada);
		salida = (TextView) findViewById(R.id.salida);

	}

	public void sePulsa(View view) {

		salida.setText(String.valueOf(Float.parseFloat(entrada.getText()
				.toString()) * 2.0));
	}

	public void sePulsa0(View view) {

		entrada.setText(entrada.getText() + (String) view.getTag());
	}

}
