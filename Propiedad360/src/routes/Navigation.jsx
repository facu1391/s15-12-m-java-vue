import React from 'react';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import PageLayout from '../layout/PageLayout';
import Home from '../pages/Home/Home';
import Comprar from '../pages/Comprar/Comprar';
import Renta from '../pages/Renta/Renta';
import AgendaUnaVisita from '../pages/AgendaUnaVisita/AgendaUnaVisita';
import PublícaTuPropiedad from '../pages/PublícaTuPropiedad/PublícaTuPropiedad';
import DetalleVivienda from '../pages/DetalleVivienda/DetalleVivienda';
import ConfirmaCita from '../pages/ConfirmaCita/ConfirmaCita';
import CaracteristicasPropiedad from '../components/CaracteristicasPropiedad/CaracteristicasPropiedad';
import ConfiguraciónPerfil from '../pages/ConfiguraciónPerfil/ConfiguraciónPerfil';
import PagoAlquiler from '../pages/PagoAlquiler/PagoAlquiler';
import RevisaTuPago from '../pages/RevisaTuPago/RevisaTuPago';
import OrdenDePago from '../pages/OrdenDePago/OrdenDePago';
import Login from '../pages/Login/Login';
import Registro from '../pages/Registro/Registro';
import Inicio from '../pages/Inicio/Inicio';

const routes = createBrowserRouter([
    {
        path: "/",
        element: <PageLayout> <Home /> </PageLayout>
    },
    {
        path: "/comprar",
        element: <PageLayout> <Comprar /> </PageLayout> 
    },
    {
        path: "/renta",
        element: <PageLayout> <Renta /> </PageLayout> 
    },
    {
        path: "/detalle-de-vivienda",
        element: <PageLayout> <DetalleVivienda /> </PageLayout> 
    },
    {
        path: "/agenda-una-visita",
        element: <PageLayout> <AgendaUnaVisita /> </PageLayout>  
    },
    {
        path: "/confirmar-cita",
        element: <PageLayout> <ConfirmaCita /> </PageLayout>  
    },
    {
        path: "/publíca-tu-propiedad",
        element: <PageLayout> <PublícaTuPropiedad /> </PageLayout>  
    },
    {
        path: "/caracteristicas-de-propiedad",
        element: <PageLayout><CaracteristicasPropiedad/></PageLayout>
    },
    {
        path: "/configuración-de-perfil",
        element: <PageLayout> <ConfiguraciónPerfil /> </PageLayout>  
    },
    {
        path: "/pago-de-alquiler",
        element: <PageLayout> <PagoAlquiler /> </PageLayout>  
    },
    {
        path: "/revisa-tu-pago",
        element: <PageLayout> <RevisaTuPago /> </PageLayout>  
    },
    {
        path: "/orden-de-pago",
        element: <PageLayout> <OrdenDePago /> </PageLayout>  
    },
    {
        path: "/login",
        element: <PageLayout> <Login /> </PageLayout>
    },
    {
        path: "/registro",
        element: <PageLayout> <Registro /> </PageLayout>
    },
    {
        path: "/iniciar-sesion",
        element: <PageLayout> <Inicio /> </PageLayout>
    }
]);

const Navigation = () => {
    return <RouterProvider router={routes} />;
};

export default Navigation;
