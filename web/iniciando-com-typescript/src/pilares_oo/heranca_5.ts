// Classe abstrata
abstract class Celular {
    ligar() {
        console.log('em ligação')
    }

    abstract acessarRedeMovel(): void
}

// Classe concreta
class IPhone23Pro extends Celular {
    acessarRedeMovel(): void {
        console.log('Usando rede 7.5G')
    }
}
class GalaxyS57Ultra extends Celular {
    acessarRedeMovel(): void {
        console.log('Usando rede 12G')
    }
}

let c1 = new GalaxyS57Ultra()
c1.ligar()
c1.acessarRedeMovel

c1 = new IPhone23Pro()
c1.ligar()
c1.acessarRedeMovel()

export {}