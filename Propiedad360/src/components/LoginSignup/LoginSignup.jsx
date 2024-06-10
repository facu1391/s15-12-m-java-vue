import React from 'react';
import login1 from './assets/login1.png';
import login2 from './assets/login2.png';
import login3 from './assets/login3.png';

const LoginSignup = () => {
  return (
    <section>
      <h1 className='text-yellow text-lg font-bold text-align center'>¿Listo para vender o adquirir la propiedad que deseas?</h1>
      <div>
        <img src={login1} alt="" className="w-[906px] h-[636px] mt-4 justify-center"/>
      </div>
      <Link to="../InicioSesión" className="justify-center">
        <button className="btn btn-wide bg-buttonColor text-white w-21% h-4 margin auto">Continua con email</button>
      </Link>
      <button className="btn btn-wide bg-buttonColor"><img src={login2} alt=""/></button>
      <button className="btn btn-wide bg-buttonColor"><img src={login3} alt=""/></button>
      <h2 className='text-black text-lg font-bold text-align center'>
        ¿No tienes cuenta? 
        <Link to="../Registro" className='text-yellow'>Registrate gratis</Link>
      </h2>
    </section>
  )
}

export default LoginSignup;