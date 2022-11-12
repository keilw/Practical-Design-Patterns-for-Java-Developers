/**
 * 
 */
/**
 * @author Werner
 *
 */
module chap03 {
	uses chap03.api.Vehicle;	
	provides chap03.api.Vehicle with chap03.impl.SportVehicle;
}