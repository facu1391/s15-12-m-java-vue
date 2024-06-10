import React from 'react';
import inicio from './assets/inicio.jpeg';

function InicioSesión() {
  return (
    <section classname="mt-9">
      <img src={inicio} alt="" className="w-full mt-4" />
      <div class="w-full sm:w-[582px] h-auto gap-16 mx-auto md:ml-[250px] rounded-md px-4 py-6 md:p-8">
        <h1 class="text-black text-3xl font-bold">Crea una cuenta</h1>
        <h2 class="text-grey text-lg font-bold">Es necesaria para acceder a diversas funciones</h2>
      </div>
      <div class="w-84% h-36% bg-grey justify-center">
        <h2 class="text-black text-3xl font-bold">Email:</h2>
          <input
            type="text"
            placeholder="Ingrese su correo"
            className="w-full px-4 py-2 pl-10 bg-white border border-customColor4 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500"
          />
        <h2 class="text-black text-3xl font-bold">Contraseña:</h2>
        <input
          type="password"
          placeholder="Crea una contraseña"
          className="w-full px-4 py-2 pl-10 bg-white border border-customColor4 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500"
        />
        <button className="btn btn-wide bg-buttonColor text-white w-21% h-4 margin auto">Acceder</button>
      </div>
    </section>
  )
}

export default InicioSesión;