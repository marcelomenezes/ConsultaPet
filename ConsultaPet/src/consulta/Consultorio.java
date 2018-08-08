package consulta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import modelo.*;

public class Consultorio {
	private Map<Integer, Pet> consultas = new HashMap<Integer, Pet>();
	
	public static void main(String[] args) {
		
		ArrayList<Medico> listaMedico = new ArrayList();
		ArrayList<Pet> listaPet = new ArrayList(),  listaConsulta = new ArrayList();
		ArrayList<Pet> listaConsultaPriori = new ArrayList();
		
		//sadsadadas
		
		
		//Adiciona exemplos pra teste
		Pet pet1 = new Pet(1, "Laika", "cachorro", "poodle", false, "Cardiologista");
		Pet pet2 = new Pet(2, "shera", "cachorro", "pastor", false, "Cardiologista");
		Pet pet3 = new Pet(3, "Anastacia", "cachorro", "poodle", false, "Pediatra");
		Pet pet4 = new Pet(4, "Frevo", "gato ","vira-lata", true, "Pediatra");
		
		listaPet.add(pet1);
		listaPet.add(pet2);
		listaPet.add(pet3);
		listaPet.add(pet4);
		
		//Adiciona médicos
		Medico med1 = new Medico(1, "João", "Pediatra");
		Medico med2 = new Medico(2, "José", "Cardiologista");
		
		listaMedico.add(med1);
		listaMedico.add(med2);
		
		listaConsulta = (ArrayList<Pet>)listaPet.clone();
		
		
		//Receber conteúdo das listas 
		/*
		for(Medico medico : listaMedico) {
			listaMedico.add(medico);
		}
		for(Pet pet : listaPet){
			listaPet.add(pet);
		*/
		
		
		//Escalona os atendimentos prioritários
		for(Pet pet: listaPet) { 
			if (pet.isUrgente()) {
				listaConsultaPriori.add(pet);
				listaConsulta.remove(pet);
			}
		}
		
		
		/*
		for(Pet pet: listaConsulta) {
			listaConsultaPriori.add(pet);
			System.out.println(pet.getNome());
		}
		*/
		//adiciona os atendimentos normais
		listaConsultaPriori.addAll(listaConsulta);
		
		//Lista os médicos e sua agenda em sequência
		for(Medico medico : listaMedico) {
			System.out.println("Médico:");
			System.out.println(medico.getId());
			System.out.println("Agenda Consultório: ");
			for(Pet pet: listaConsultaPriori) {
				if(pet.getNecessita().equals(medico.getEspecialidade())) {
					
					
					System.out.println("pet: ");
					System.out.println(pet.getNome());
					System.out.println(medico.getId());
					break;
					
				}
			}
			System.out.println("----------");
		}
		
	
	}
	
	
}
