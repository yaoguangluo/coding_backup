/**
 * 
 */
package VSQ.OPE.jogl;

import java.util.ArrayList;


public class JOGLOBJShape {
	
	private String name=null;
	private ArrayList<JOGLOBJFace> faces = new ArrayList<JOGLOBJFace>();
	
	public void I_Name(String name) {
		this.name = name;
		
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	public void I_(JOGLOBJFace f) {
		faces.add(f);
	}

	public int numberOfFaces() {
		return faces.size();
	}
	
	public ArrayList<JOGLOBJFace> getFaceList() {
		return faces;
	}

}
