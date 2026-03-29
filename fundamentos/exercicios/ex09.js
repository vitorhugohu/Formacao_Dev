const estados = ` SIGLA;NOME;CAPITAL;REGIÃO;
AC;ACRE;RIO BRANCO;NORTE;
PA;PARÁ;BELÉM;NORTE;
RO;RONDÔNIA;PORTO VELHO;NORTE;
RR;RORAIMA;BOA VISTA;NORTE;
TO;TOCANTINS;PALMAS;NORTE;
MA;MARANHÃO;SÃO LUIZ;NORDESTE;
PB;PARAÍBA;JOÃO PESSOA;NORDESTE;
PE;PERNAMBUCO;RECIFE;NORDESTE;
PI;PIAUÍ;TEREZINA;NORDESTE;
RN;RIO GRANDE DO NORTE;NATAL;NORDESTE;
SE;SERGIPE;ARACAJÚ;NORDESTE;
GO;GOIÁS;GOIÂNIA;CENTRO-OESTE;
MS;MATO GROSSO DO SUL;CAMPO GRANDE;CENTRO-OESTE;
MT;MATO GROSSO;CUIABÁ;CENTRO-OESTE;
ES;ESPÍRITO SANTO;VITÓRIA;SUDESTE;
MG;MINAS GERAIS;BELO HORIZONTE;SUDESTE;
RJ;RIO DE JANEIRO;RIO DE JANEIRO;SUDESTE;
SP;SÃO PAULO;SÃO PAULO;SUDESTE;
RS;RIO GRANDE DO SUL;PORTO ALEGRE;SUL;
SC;SANTA CATARINA;FLORIANÓPOLIS;SUL;
AM;AMAZONAS;MANAUS;NORTE;
AP;AMAPÁ;MACAPÁ;NORTE;
AL;ALAGOAS;MACEIÓ;NORDESTE;
BA;BAHIA;SALVADOR;NORDESTE;
CE;CEARÁ;FORTALEZA;NORDESTE;
PR;PARANÁ;CURITIBA;SUL`

let estadosSplit = estados.split("\n")

let objetosEstados = []

for (let i = 1; i < estadosSplit.length; i++) {
    let estadoAtual = estadosSplit[i]
    let informacoesEstado = estadoAtual.split(";")
    let objetoEstado = {
        sigla: informacoesEstado[0],
        nome: informacoesEstado[1],
        capital: informacoesEstado[2],
        regiao: informacoesEstado[3]
    }
    objetosEstados.push(objetoEstado)
}

function procuraPorRegiao(regiao) {
    let estadosDaRegiao = []
    for (let i = 0; i < objetosEstados.length; i++) {
        let estado = objetosEstados[i]
        if (estado.regiao === regiao) {
            estadosDaRegiao.push(estado)
        }
    }
    return estadosDaRegiao
}

function encontraNome(sigla) {
    for (estado of objetosEstados) {
        if (estado.sigla === sigla) {
            return estado.nome
        }
    }
}

console.log(encontraNome("RJ"))