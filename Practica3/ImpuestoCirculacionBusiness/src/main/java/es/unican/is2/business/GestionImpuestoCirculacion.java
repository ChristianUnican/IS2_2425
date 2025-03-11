package es.unican.is2.business;

import es.unican.is2.common.Contribuyente;
import es.unican.is2.common.DataAccessException;
import es.unican.is2.common.IContribuyentesDAO;
import es.unican.is2.common.IVehiculosDAO;
import es.unican.is2.common.OperacionNoValidaException;
import es.unican.is2.common.Vehiculo;
import es.unican.is2.dao.ContribuyentesDAO;
import es.unican.is2.dao.VehiculosDAO;

public class GestionImpuestoCirculacion implements IGestionContribuyentes, IGestionVehiculos, IInfoImpuestoCirculacion {
    // Atributos
    private IContribuyentesDAO contribuyentesDAO;
    private IVehiculosDAO vehiculosDAO;

    // Constructor
    public GestionImpuestoCirculacion(IContribuyentesDAO contribuyentesDAO, IVehiculosDAO vehiculosDAO) {
        this.contribuyentesDAO = contribuyentesDAO;
        this.vehiculosDAO = vehiculosDAO;
    }

	public Vehiculo vehiculo(String matricula) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public Contribuyente contribuyente(String dni) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public Vehiculo altaVehiculo(Vehiculo v, String dni) throws OperacionNoValidaException, DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public Vehiculo bajaVehiculo(String matricula, String dni) throws OperacionNoValidaException, DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean cambiaTitularVehiculo(String matricula, String dniActual, String dniNuevo)
			throws OperacionNoValidaException, DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

	public Contribuyente altaContribuyente(Contribuyente c) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public Contribuyente bajaContribuyente(String dni) throws OperacionNoValidaException, DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

    // Métodos de las interfaces (por ahora no implementados)

}
