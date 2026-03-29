function metadados(objeto) {
    let metadados = {
        qtdBoolean: 0,
        qtdNumber: 0,
        qtdString: 0,
        qtdFunction: 0
    }

    let valoresObjeto = Object.values(objeto)

    for (valor of valoresObjeto) {
        switch(typeof valor) {
            case "boolean":
                metadados.qtdBoolean += 1
                break
            case "function":
                metadados.qtdFunction += 1
                break
            case "string":
                metadados.qtdString += 1
                break
            case "number":
                metadados.qtdNumber += 1
                break
        }
    }
    
    objeto.metadados = metadados

    return objeto
}

const carro = {
    model: "Gol",
    marca: "Volkswagen",
    cor: "verde",
    ano: 2007,
    qtdePortas: 4,
    vidrosEletricos: true,
    seguro: true,
    acelerar: () => console.log("Indo mais rápido..."),
    frear: () => console.log("Parando..."),
    abrirVidros: () => console.log("Abrindo vidros...")
}

console.log(metadados(carro))