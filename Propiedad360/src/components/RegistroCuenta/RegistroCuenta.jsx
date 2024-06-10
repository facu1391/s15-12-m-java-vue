import React from 'react';
import registro1 from './assets/registro1.jpeg';
import registro2 from './assets/registro2.jpeg';
import registro3 from './assets/registro3.jpeg';
import registro4 from './assets/registro4.jpeg';
import registro5 from './assets/registro5.jpeg';
import registro6 from './assets/registro6.jpeg';

const RegistroC = () => {
  return (
    <section classname="mt-9">
      <div class="w-full sm:w-[582px] h-auto gap-16 mx-auto md:ml-[250px] rounded-md px-4 py-6 md:p-8">
        <h1 class="text-black text-3xl font-bold">Crea una cuenta</h1>
        <h2 class="text-grey text-lg font-bold">Es necesaria para acceder a diversas funciones</h2>
      </div>
      <div class="w-84% h-36% bg-grey justify-center">
        <h2 class="text-black text-3xl font-bold">Nombre:</h2>
        <input
          type="text"
          placeholder="Ingrese su nombre"
          className="w-full px-4 py-2 pl-10 bg-white border border-customColor4 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500"
        />
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
        <button className="btn btn-wide bg-buttonColor text-white w-21% h-4 margin auto">Registrarte</button>
      </div>
      <div className="mt-9 flex flex-wrap justify-center items-start">
        <div className="w-[499px] h-[212px] mt-20 mr-9">
          <img src={registro1} alt="" className="w-full h-full object-cover" />
        </div>
        <div className="flex flex-col items-center">
          <div className="w-[237px] h-[218px]">
            <img src={registro2} alt="" className="w-full h-full object-cover" />
          </div>
          <div className="w-[237px] h-[218px] mt-4">
            <img src={registro3} alt="" className="w-full h-full object-cover" />
          </div>
        </div>
        <div className="w-[291px] h-[454px] ml-8">
          <img src={registro4} alt="" className="w-full h-full object-cover" />
        </div>
        <div className="flex flex-col items-center ml-8">
          <div className="w-[395px] h-[212px] mt-4">
            <img src={registro5} alt="" className="w-full h-full object-cover" />
          </div>
          <div className="w-[395px] h-[218px] mt-4">
            <img src={registro6} alt="" className="w-full h-full object-cover" />
          </div>
        </div>
      </div>
    </section>
  )
}

export default RegistroC;