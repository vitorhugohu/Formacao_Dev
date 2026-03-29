import InputFormatado from "@/components/formulario/InputFormatado";
import Botao from "@/components/template/Botao";
import Display from "@/components/template/Display";
import Flex from "@/components/template/Flex";
import Pagina from "@/components/template/Pagina";
import { useEffect, useReducer, useState, Reducer } from "react";

function mudaDados(estadoAtual, acao) {
  switch (acao.type) {
    case "ALTERA_NUM1":
      window.alert("NUM1");
      return {
        ...estadoAtual,
        num1: acao.novoValor,
        validadeNum1: acao.novoValor,
      };
      case "ALTERA_NUM2":
      window.alert("NUM2");
      return {
        ...estadoAtual,
        num1: acao.novoValor,
        validadeNum2: acao.novoValor,
      };
      case "SOMA":
        if(estadoAtual.validadeNum1 && estadoAtual.validadeNum2) {
            let soma = estadoAtual.num1 + estadoAtual.num2
            return {...estadoAtual, soma: soma}
        } else {
            return {... estadoAtual, soma: -9999}
        }
  }
}

export default function () {
  const [dados, dispatchDados] = useReducer<Reducer<any, any>>(mudaDados, {
    num1: 0,
    num2: 0,
    validadeNum1: false,
    validadeNum2: false,
    soma: 0,
  });

  return (
    <Pagina titulo="Soma com useState" subtitulo="Exemplo de soma com useState">
      <Flex center centerCross>
        <Display texto={"Faça uma soma"}></Display>
        <Flex center>
          <InputFormatado
            tipo="number"
            valor={dados.num1}
            onInput={(e) =>
              dispatchDados({ type: "ALTERA_NUM1", novoValor: +e.target.value })
            }
          />
          <span className="text-4xl ml-2">+</span>
          <InputFormatado
            tipo="number"
            valor={dados.num2}
            onInput={(e) => dispatchDados({type: "ALTERA_NUM2", novoValor: +e.target.value})}
          />
          <Botao cor="bg-orange-400" texto="=" onClick={() => dispatchDados({type: "SOMA"})}></Botao>
        </Flex>
        <Display texto={dados.soma} />
      </Flex>
    </Pagina>
  );
}
