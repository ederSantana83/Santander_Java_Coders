var rodada = 1;
var matriz_jogo = Array(3); //[0,0,0,],[0,0,0],[0,0,0] linhas a,b,c colunas 1,2,3

matriz_jogo['a'] = Array(3);
matriz_jogo['b'] = Array(3);
matriz_jogo['c'] = Array(3);

matriz_jogo['a'][1] = 0;
matriz_jogo['a'][2] = 0;
matriz_jogo['a'][3] = 0;

matriz_jogo['b'][1] = 0;
matriz_jogo['b'][2] = 0;
matriz_jogo['b'][3] = 0;

matriz_jogo['c'][1] = 0;
matriz_jogo['c'][2] = 0;
matriz_jogo['c'][3] = 0;


$(document).ready(function(){

   $("#btn_iniciar_jogo").click(function(){
      
    //Seletor para .value no Jquery
    //$("#id").val();

    //valida a digitação dos apelidos dos jogadores

    if(($("#entrada_apelido_jogador_1").val() == '') && ($("#entrada_apelido_jogador_2").val() == '')){
        alert("Ambos jogadores não informaram seus apelidos");
        return false;
    }

    if($("#entrada_apelido_jogador_1").val() == ''){
        alert("Apelido do jogador 1 não foi preenchido")
        //$("#entrada_apelido_jogador_1").val('Jogador1');
        return false;
    }
    if($("#entrada_apelido_jogador_2").val() == ''){
        alert("Apelido do jogador 2 não foi preenchido");
        return false;
    }

    //exibir os apelidos, criar os spans "nome_jogador_1"
    $("#nome_jogador_1").html($("#entrada_apelido_jogador_1").val());
    $("#nome_jogador_2").html($("#entrada_apelido_jogador_2").val());
 
    //controlar visualização das divs
    $("#pagina_inicial").hide();
    $("#palco_jogo").show();

    });


    $(".jogada").click(function(){
        //criar id em cada div do jogo
        var id_campo_clicado = this.id;
        $("#"+id_campo_clicado).off();
        jogada(id_campo_clicado);
    });

    function jogada(id){
        //criar variável rodada
        var icone = '';
        var ponto = 0;
        
        //a cada rodada verifica que jogador está jogando (par ou impar)
        if((rodada % 2) == 1){
            icone = 'url("imagens/marcacao_1.png")';
            ponto = -1;
        }else{
            icone = 'url("imagens/marcacao_2.png")';
            ponto = 1;
        }
    
        rodada++;

        $("#"+id).css('background-image', icone);

        //criar arrays globalmente
        //quebrar o id para pegar linha e coluna
        var linha_coluna = id.split('-'); //a-1

        matriz_jogo[linha_coluna[0]][linha_coluna[1]] = ponto;

        //verificação se houve vencedor
        console.log(matriz_jogo);
        verifica_combinacao();

    }

    function verifica_combinacao(){
    var pontos = 0;    
        //verifica na horizontal linha A
        
        for(var i = 1; i <= 3; i++){
            pontos += matriz_jogo['a'][i];
        }

        ganhador(pontos);

        //verificar na horizontal linha B
        pontos = 0;
        for(var i = 1; i <= 3; i++){
            pontos += matriz_jogo['b'][i];
        }

        ganhador(pontos);

        //verificar na horizontal linha C
        pontos = 0;
        for(var i = 1; i <= 3; i++){
            pontos += matriz_jogo['c'][i];
        }
        
        ganhador(pontos);
        
        //verifica na vertical
        for(var i = 1; i <= 3; i++){
            pontos = 0;
            pontos = pontos + matriz_jogo['a'][i];
            pontos = pontos + matriz_jogo['b'][i];
            pontos = pontos + matriz_jogo['c'][i];

        ganhador(pontos);
        }

        //verifica na diagonal
        pontos = 0;
        pontos = matriz_jogo['a'][1] + matriz_jogo['b'][2] + matriz_jogo['c'][3];
        ganhador(pontos);

        pontos = 0;
        pontos = matriz_jogo['a'][3] + matriz_jogo['b'][2] + matriz_jogo['c'][1];
        ganhador(pontos);

    }

    function ganhador(pontos){
        if(pontos == -3){
            var jogada_1 = $('#entrada_apelido_jogador_1').val();
            alert(jogada_1 + ' é o vencedor');
            $('.jogada').off();
            location.reload()
        }else if(pontos == 3){
            var jogada_2 = $('#entrada_apelido_jogador_2').val();
            alert(jogada_2 + ' é o vencedor');        
            $('.jogada').off();
            location.reload()
        }
        
    }

});








