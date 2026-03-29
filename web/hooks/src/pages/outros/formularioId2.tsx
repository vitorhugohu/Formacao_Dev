import InputComId from "@/components/formulario/InputcomId";
import Pagina from "@/components/template/Pagina";

export default function() {
    return (
        <Pagina titulo="Usando o hook userId em um componente" subtitulo="Reusando um componente com o useId">
            <InputComId label="Nome"/>
            <InputComId label="Sobrenome"/>
        </Pagina>
    )
}