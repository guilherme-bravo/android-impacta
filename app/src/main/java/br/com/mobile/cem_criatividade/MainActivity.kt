package br.com.mobile.cem_criatividade

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.login.*

class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        imagemLogin.setImageResource(R.drawable.mundi)

        MensagemLogin.text = "Nova Mensagem de login"

        botaoLogin.setOnClickListener{

            val valorUsuario = campoUsuario.text.toString()
            val senhaUsuario = campoSenha.text.toString()

            if (valorUsuario == "aluno" && senhaUsuario == "impacta"){
                val intent = Intent(this, TelaInicialActivity::class.java)
                val params = Bundle()
                params.putString("usuario", valorUsuario)
                params.putInt("n", 10)
                params.putBoolean("bool", true)
                intent.putExtras(params)
                intent.putExtra("nome", "Lucas Brasileiro")
                startActivity(intent)
            }else{
                Toast.makeText(this, "Usuário ou senha incorretos ", Toast.LENGTH_LONG).show()
            }

    fun cliqueSair(){
        val returnIntent = Intent();
        returnIntent.putExtra("result","Saída do App");
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
        }
    }
}
