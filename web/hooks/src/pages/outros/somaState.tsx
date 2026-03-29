import InputFormatado from "@/components/formulario/InputFormatado";
import Botao from "@/components/template/Botao";
import Display from "@/components/template/Display";
import Flex from "@/components/template/Flex";
import Pagina from "@/components/template/Pagina";
import { useEffect, useState } from "react";

export default function() {
    const [num1, setNum1] = useState(0)
    const [num2, setNum2] = useState(0)
    const [validadeNum1, setValidadeNum1] = useState(false)
    const [validadeNum2, setValidadeNum2] = useState(false)
    const [soma, setSoma] = useState(0)

    useEffect(() => {
        setValidadeNum1(num1>0)
    }, [num1])

    useEffect(() => {
        setValidadeNum2(num2>0)
    }, [num2])

     function fazSoma() {
        if(validadeNum1 && validadeNum2) {
            setSoma(num1 + num2)
        } else {
            setSoma(-9999)
        }
    }

    return (
        <Pagina titulo="Soma com useState" subtitulo="Exemplo de soma com useState">
            <Flex center centerCross>
                <Display texto={"Faça uma soma"}></Display>
                <Flex center>
                    <InputFormatado tipo="number" valor={num1} onInput={(v) => setNum1(+v.target.value)}/>
                    <span className="text-4xl ml-2">+</span>
                    <InputFormatado tipo="number" valor={num2} onInput={(v) => setNum2(+v.target.value)}/>
                    <Botao cor="bg-orange-400" texto="=" onClick={fazSoma}></Botao>
                </Flex>
                <Display texto={soma}/>
            </Flex>
        </Pagina>
    )
}