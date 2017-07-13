package com.captton.programa;

import com.captton.universidad.Alumno;
import com.captton.universidad.AlumnoPosgrado;
import com.captton.universidad.Curso;
import com.captton.universidad.Profesor;
import com.captton.universidad.Universidad;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Alumno al1 = new Alumno(24587416,"Matias","Micen");
	        Alumno al2 = new Alumno(21587416,"Jose","Seman");
	        AlumnoPosgrado alPos1 = new AlumnoPosgrado(20587416, "Roberto", "Muller");
	        
	        Curso cur1 = new Curso(73222,"Analisis I",12);
	        Curso cur2 = new Curso(73111,"Fisica II",8);
	        Curso cur3 = new Curso(73000,"Programacion I",12);
	        
	        Profesor prof1 = new Profesor(30222333, "Prof. Juan", "Pescarmon");
	        Profesor prof2 = new Profesor(31444777, "Prof. Esteban", "Pasucci");
	        Profesor prof3 = new Profesor(32443111, "Prof. Analia", "Estuitre");
	        
	        
	        Universidad uni1 = new Universidad("UBA", true, "Ingenieria");
	        
	        cur1.setProfesor(prof1);
	        cur2.setProfesor(prof2);
	        cur3.setProfesor(prof3);
	        
	        al1.InscribirCurso(cur1);
	        al1.InscribirCurso(cur2);

	        al2.InscribirCurso(cur3);
	        
	        alPos1.InscribirCurso(cur3);
	        
	        al1.ListarCursosInscriptos();
	        al2.ListarCursosInscriptos();
	        alPos1.ListarCursosInscriptos();
	        
	        uni1.InscribirAlumno(al2);
	        
	        uni1.BuscarAlumoXDni(21587416);

	}

}
