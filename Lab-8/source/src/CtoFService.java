/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/mtogrservices")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		char res = 0;
		int mrks = 100;
		if(mrks>80){
		res= 'A';
		}
		if((mrks>70)&(mrks<80)){
			res='B';
		}
 
		String result = "@Produces(\"application/xml\") Output: \n\nmarks to grade Converter Output: \n\n" + res +" grade";
		return "<htosecservices>" + "<marks>" + mrks + "</marks>" + "<htosecoutput>" + result +  "</htosecoutput>" + "</htosecservices>";
		}
	
	
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
}