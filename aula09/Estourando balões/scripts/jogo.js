function iniciaJogo(){
	
	var url = window.location.search;

	var nivel_jogo = url.replace("?","");
	
	var tempo_segundos = 0;

	if(nivel_jogo == 1){ //1 fácil -> 120 segundos
		tempo_segundos = 120;
	}

	if(nivel_jogo == 2){ //2 normal -> 60 segundos
		tempo_segundos = 60;
	}

	if(nivel_jogo == 3){ //3 difícil -> 30 segundos
		tempo_segundos = 30;
	}

	//inserindo segundos no spam
	document.getElementById("cronometro").innerHTML = tempo_segundos;

	var qtde_baloes = 20;

	//imprimir qtde baloes inteiros
	document.getElementById('baloes_inteiros').innerHTML = qtde_baloes;
	document.getElementById('baloes_estourados').innerHTML	= 0;

	cria_baloes(qtde_baloes);

	contagem_tempo(tempo_segundos + 1);

}

	var timerId = null //variável que armazena o chamada da função timeout

	function contagem_tempo(segundos){//121

		segundos = segundos - 1;//120

		if(segundos == -1){
			clearTimeout(timerId);//para a execução da função setTimeout
			game_over();
			parar_jogo();
			return false; // return false para a execução do jogo
		}

		document.getElementById('cronometro').innerHTML = segundos;

		timerId = setTimeout("contagem_tempo("+segundos+")", 1000);
	}

	function game_over(){
		alert("Fim de jogo, você não conseguiu estourar todos os balões a tempo");	
	}

	function cria_baloes(qtde_baloes){
		for(var i = 1; i <= qtde_baloes; i++){

			var balao = document.createElement("img");
			balao.src = "imagens/balao_azul_pequeno.png";
			balao.style.margin = '10px';
			balao.id = 'b' + i;
			balao.onclick = function(){
				estourar(this);
			};

			document.getElementById('cenario').appendChild(balao);
		}

		function estourar(e){

			var id_balao = e.id;
			
			document.getElementById(id_balao).src = "imagens/balao_azul_pequeno_estourado.png";
			document.getElementById(id_balao).setAttribute("onclick","");

			pontuacao();
		}

		function remove_eventos_baloes(){
			var i = 1; //contador para recuperar balões por id

			//percorre os elementos de acordo com o id 
			while(document.getElementById('b' + i)){
				//retira o evento de click do elemento
				document.getElementById('b' + i).onclick = '';
				i++; //incremento
			}
		}

		function pontuacao(){
			var baloes_inteiros = document.getElementById('baloes_inteiros').innerHTML;
			var baloes_estourados = document.getElementById('baloes_inteiros').innerHTML;

			baloes_inteiros = parseInt(baloes_inteiros);
			baloes_estourados = parseInt(baloes_estourados);

			baloes_inteiros--; 		
			baloes_estourados++; 

			document.getElementById('baloes_inteiros').innerHTML = baloes_inteiros;
			document.getElementById('baloes_estourados').innerHTML = baloes_estourados;

			situacao_jogo(baloes_inteiros);
		}
		function situacao_jogo(baloes_inteiros){
			if(baloes_inteiros == 0){
				alert('Parabéns, você conseguiu estourar todos os balões a tempo');
				parar_jogo();
			}
		}
		function parar_jogo(){
			clearTimeout(timerId);
			remove_eventos_baloes();
		}


	};




