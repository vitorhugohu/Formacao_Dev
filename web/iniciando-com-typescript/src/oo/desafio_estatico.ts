class DesafioEstatico {
    nota: number = 1000 // atributo de instância

    // método de class (estático)
    static executar() {
        // imprimir o valor de nota no console
        const instancia = new DesafioEstatico()
        console.log(instancia.nota)
    }
}

DesafioEstatico.executar()