interface TituloProps {
    principal: string
    secundario: string
    gradiente?: boolean
}

export default function Titulo(props: TituloProps) {
    return (
        <div className="flex flex-col items-start">
            <h1 className={`
                text-4xl font-black
                ${props.gradiente ? 'bg-gradient-to-r from-blue-500 to-green-500 bg-clip-text text-transparent' : ''}
            `}>
                {props.principal}
            </h1>
            <h2 className="text-base font-light text-zinc-500">{props.secundario}</h2>
        </div>
    )
}