package br.com.mobile.cem_criatividade

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela_inicial.*

class TelaInicialActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val args = intent.extras
        val usuario = args?.getString("usuario")


        textoTelaInicial.text = "Olá, $usuario"

        botaoSair.setOnClickListener{cliqueSair()}
    }
    fun cliqueSair(){
        val returnIntent = Intent();
        returnIntent.putExtra("result","Saída do App");
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_buscar){
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show()
        } else if (id == R.id.action_atualizar){
            Toast.makeText(this, "Atualizar", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)

    }
}