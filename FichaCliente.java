import java.util.Scanner;

public class FichaCliente {
	
	//Validações e verificações de cada item
	public static boolean verificarNome(String nome) {
		if(nome == null || nome.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarNome(String nome) {
		if(nome.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarTelefone(String telefone) {
		if(telefone == null || telefone.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarTelefone(String telefone) {
		if(telefone.matches("[0-9]*") && telefone.length() == 11)
			return true;
		else
			return false;
	}

	public static boolean verificarEndereco(String endereco) {
		if(endereco == null || endereco.isBlank())
			return false;
		else
			return true;
	}

	public static boolean verificarSetor(String setor) {
		if(setor == null || setor.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarSetor(String setor) {
		if(setor.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarCidade(String cidade) {
		if(cidade == null || cidade.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarCidade(String cidade) {
		if(cidade.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarEstado(String estado) {
		if(estado == null || estado.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarEstado(String estado) {
		if(estado.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarCep(String cep) {
		if(cep == null || cep.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarCep(String cep) {
		if(cep.matches("[0-9]*") && cep.length() == 8)
			return true;
		else
			return false;
	}
	
	public static boolean verificarCpf(String cpf) {
		if(cpf == null || cpf.isBlank())
			return false;
		else
			return true;
	}
		
	public static boolean validarCpf(String cpf) {
		if(cpf.matches("[0-9]*") && cpf.length() == 11)
			return true;
		else
			return false;
	}

	public static boolean verificarRg(String rg) {
		if(rg == null || rg.isBlank())
			return false;
		else
			return true;
	}
		
	public static boolean validarRg(String rg) {
		if(rg.matches("[0-9]*") && rg.length() == 7)
			return true;
		else
			return false;
	}

	public static boolean verificarOrgao(String orgãoEmissor) {
		if(orgãoEmissor == null || orgãoEmissor.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarOrgao(String orgãoEmissor) {
		if(orgãoEmissor.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarNascimento(String dataNascimento) {	
		if(dataNascimento == null || dataNascimento.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarNascimento(String datanascimento) {
		if(String.format("13/12/2003") != null)
			return true;
		else
			return false;
	}

	public static boolean verificarEstadoCivil(String estadoCivil) {
		if(estadoCivil == null || estadoCivil.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarEstadoCivil(String estadoCivil) {
		if(estadoCivil.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}
		
	public static boolean verificarEmail(String email) {
		if(email == null || email.isBlank())
			return false;
		else
			return true;
	}
		
	public static boolean validarEmail(String email) {
		if(email.contains("@") && email.contains(".com"))
			return true;
		else
			return false;
	}

	public static boolean verificarPonto(String pontoDeReferencia) {
		if(pontoDeReferencia == null || pontoDeReferencia.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarPonto(String pontoDeReferencia) {
		if(pontoDeReferencia.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarFirma(String firma) {
		if(firma == null || firma.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarFirma(String firma) {
		if(firma.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarFoneFirma(String foneFirma) {
		if(foneFirma == null || foneFirma.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarFoneFirma(String foneFirma) {
		if(foneFirma.matches("[0-9]*") && foneFirma.length() == 11 || foneFirma.length() == 8)
			return true;
		else
			return false;
	}

	public static boolean verificarTempo(String tempo) {
		if(tempo == null || tempo.isBlank())
			return false;
		else
			return true;
	}

	public static boolean verificarEnderecoFirma(String enderecoFirma) {
		if(enderecoFirma == null || enderecoFirma.isBlank())
			return false;
		else
			return true;
	}

	public static boolean verificarSetorFirma(String setorFirma) {
		if(setorFirma == null || setorFirma.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarSetorFirma(String setorFirma) {
		if(setorFirma.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarCidadeFirma(String cidadeFirma) {
		if(cidadeFirma == null || cidadeFirma.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarCidadeFirma(String cidadeFirma) {
		if(cidadeFirma.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarEstadoFirma(String estadoFirma) {
		if(estadoFirma == null || estadoFirma.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarEstadoFirma(String estadoFirma) {
		if(estadoFirma.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarSecaoFirma(String secaoFirma) {
		if(secaoFirma == null || secaoFirma.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarSecaoFirma(String secaoFirma) {
		if(secaoFirma.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarCargo(String cargo) {
		if(cargo == null || cargo.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarCargo(String cargo) {
		if(cargo.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarBanco(String banco) {
		if(banco == null || banco.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarBanco(String banco) {
		if(banco.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarAgencia(String agencia) {
		if(agencia == null || agencia.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarAgencia(String agencia) {
		if(agencia.matches("[0-9]*") && agencia.length() == 4)
			return true;
		else
			return false;
	}

	public static boolean verificarFiliacaoPai(String filiacaoPai) {
		if(filiacaoPai == null || filiacaoPai.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarFiliacaoPai(String filiacaoPai) {
		if(filiacaoPai.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}
		
	public static boolean verificarNomeMae(String nomeMae) {
		if(nomeMae == null || nomeMae.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarNomeMae(String nomeMae) {
		if(nomeMae.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarInfComercial(String infComercial) {
		if(infComercial == null || infComercial.isBlank())
			return false;
		else
			return true;
	}

	public static boolean validarInfComercial(String infComercial) {
		if(infComercial.matches("[a-z, A-Z]*") || infComercial.matches("[0-9]"))
			return true;
		else
			return false;
	}

	public static boolean verificarNome1(String nome1) {
		if(nome1 == null || nome1.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarNome1(String nome1) {
		if(nome1.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarTelefone1(String telefone1) {
		if(telefone1 == null || telefone1.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarTelefone1(String telefone1) {
		if(telefone1.matches("[0-9]*") && telefone1.length() == 11)
			return true;
		else
			return false;
	}

	public static boolean verificarEndereco1(String endereco1) {
		if(endereco1 == null || endereco1.isBlank())
			return false;
		else
			return true;
	}

	public static boolean verificarNome2(String nome2) {
		if(nome2 == null || nome2.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarNome2(String nome2) {
		if(nome2.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}

	public static boolean verificarTelefone2(String telefone2) {
		if(telefone2 == null || telefone2.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarTelefone2(String telefone2) {
		if(telefone2.matches("[0-9]*") && telefone2.length() == 11)
			return true;
		else
			return false;
	}

	public static boolean verificarEndereco2(String endereco2) {
		if(endereco2 == null || endereco2.isBlank())
			return false;
		else
			return true;
	}

	//Imprimir dados todas as vezes que um novo cliente for cadastrado.
		public static void imprimirDados(String nome, String telefone, String endereco, String setor, String cidade,
		String estado, String cep, String cpf, String rg,  String orgãoEmissor, String dataNascimento, String estadoCivil,
		String email, String pontoDeReferencia, String firma, String foneFirma, String tempo, String enderecoFirma,
		String setorFirma, String cidadeFirma, String estadoFirma, String secaoFirma, String cargo, String banco, 
		String agencia, String filiacaoPai, String nomeMae, String infComercial, String nome1, String telefone1, 
		String endereco1, String nome2, String telefone2, String endereco2) {

			System.out.println("\n========== Cliente cadastrado ==========");
			System.out.println("Nome Completo: " + nome);
            System.out.println("Telefone: " + telefone);
			System.out.println("Endereço: " + endereco);
			System.out.println("Setor: " + setor);
			System.out.println("Cidade: " + cidade);
			System.out.println("Estado: " + estado);
			System.out.println("Cep: " + cep);
			System.out.println("CPF: " + cpf);
			System.out.println("Rg: " + rg);
			System.out.println("Órgao Emissor: " + orgãoEmissor);
			System.out.println("Data de nascimento: " + dataNascimento);
			System.out.println("Estado Civil: " + estadoCivil);
			System.out.println("Email: " + email);
			System.out.println("Ponto de Referência: " + pontoDeReferencia);
			System.out.println("Firma: " + firma);
			System.out.println("Telefone da Firma: " + foneFirma);
			System.out.println("Tempo: " + tempo);
			System.out.println("Endereço da Firma: " + enderecoFirma);
			System.out.println("Setor da Firma: " + setorFirma);
			System.out.println("Cidade da Firma: " + cidadeFirma);
			System.out.println("Estado da Firma: " + estadoFirma);
			System.out.println("Seção da Firma: " + secaoFirma);
			System.out.println("Cargo: " + cargo);
			System.out.println("Banco: " + banco);
			System.out.println("Agência: " + agencia);
			System.out.println("Filiação Pai: " + filiacaoPai);
			System.out.println("Nome da Mãe: " + nomeMae);
			System.out.println("Inf. Comercial: " + infComercial);
			System.out.println("\nREFERÊNCIAS PESSOAIS (2 PESSOAS): ");
			System.out.println("Nome 1: " + nome1);
			System.out.println("Telefone 1: " + telefone1);
			System.out.println("Endereço 1: " + endereco1);
			System.out.println("Nome 2: " + nome2);
			System.out.println("Telefone 2: " + telefone2);
			System.out.println("Endereço 2: " + endereco2);
			System.out.println("========================================\n");
			}
		
		// Código principal contendo todas as entradas, validacões, verificações e impressão de dados.
		public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n\n<<<<<<<<<< BEM VINDO AO SISTEMA SYSTEM-BR! >>>>>>>>>>");
		
		System.out.println("\n>>>>>>>>>>>>>>>>");
		System.out.println("FICHA DE CLIENTE");
		System.out.println(">>>>>>>>>>>>>>>>");
		
		String nome;
        String telefone;
        String endereco;
        String setor;
        String cidade;
        String estado;
        String cep;
		String cpf;
        String rg;
        String orgãoEmissor; 
        String dataNascimento;
        String estadoCivil;
		String email;
        String pontoDeReferencia;
        String firma;
        String foneFirma;
        String tempo;
        String enderecoFirma;
        String setorFirma;
        String cidadeFirma;
        String estadoFirma;
        String secaoFirma;
        String cargo;
        String banco;
        String agencia;
        String filiacaoPai;
        String nomeMae;
        String infComercial;

        String nome1;
        String telefone1;
        String endereco1;
        String nome2;
        String telefone2;
        String endereco2;
		
		String resposta = "SIM";
		
		while (resposta.toUpperCase().equals("SIM")) {
		
		System.out.println("\nInforme o nome do cliente: ");
		nome = entrada.nextLine();
		
		while(!verificarNome(nome)) {
			System.out.println("Campo obrigatório: Nome!");
			System.out.println("Informe o nome do cliente novamente:");
			nome = entrada.nextLine();
			}
		
		while(!validarNome(nome)) {
			System.out.println("Nome inválido! Digite apenas letras, sem acentuação!");
			System.out.println("Informe o nome do cliente novamente:");
			nome = entrada.nextLine();
			}

		System.out.println("\nInforme o telefone do cliente: ");
		telefone = entrada.nextLine();
		
		while(!verificarTelefone(telefone)) {
			System.out.println("Campo obrigatório: Telefone!");
			System.out.println("Informe o telefone do cliente novamente:");
			telefone = entrada.nextLine();
			}
		
		while(!validarTelefone(telefone)) {
			System.out.println("Telefone inválido! Digite apenas números, com 8 ou 11 dígitos.");
			System.out.println("Informe o telefone do cliente novamente:");
			telefone = entrada.nextLine();
			}

		System.out.println("\nInforme o endereço do cliente: ");
		endereco = entrada.nextLine();
		
		while(!verificarEndereco(endereco)) {
			System.out.println("Campo obrigatório: Endereço!");
			System.out.println("Informe o endereço do cliente novamente:");
			endereco = entrada.nextLine();
			}
		
		System.out.println("\nInforme o setor do cliente: ");
		setor = entrada.nextLine();
		
		while(!verificarSetor(setor)) {
			System.out.println("Campo obrigatório: Setor!");
			System.out.println("Informe o setor do cliente novamente:");
			setor = entrada.nextLine();
			}
		
		while(!validarSetor(setor)) {
			System.out.println("Setor inválido!");
			System.out.println("Informe o setor do cliente, sem acentuação, novamente:");
			setor = entrada.nextLine();
			}

		System.out.println("\nInforme a cidade do cliente: ");
		cidade = entrada.nextLine();
		
		while(!verificarCidade(cidade)) {
			System.out.println("Campo obrigatório: Cidade!");
			System.out.println("Informe a cidade do cliente novamente:");
			cidade = entrada.nextLine();
			}
		
		while(!validarCidade(cidade)) {
			System.out.println("Cidade inválida!");
			System.out.println("Informe a cidade do cliente, sem acentuação, novamente:");
			cidade = entrada.nextLine();
			}

		System.out.println("\nInforme o estado do cliente: ");
		estado = entrada.nextLine();
		
		while(!verificarEstado(estado)) {
			System.out.println("Campo obrigatório: Estado!");
			System.out.println("Informe o estado do cliente novamente:");
			estado = entrada.nextLine();
			}
		
		while(!validarEstado(estado)) {
			System.out.println("Estado inválido!");
			System.out.println("Informe o estado do cliente, sem acentuação, novamente:");
			estado = entrada.nextLine();
			}

		System.out.println("\nInforme o cep do cliente: ");
		cep = entrada.nextLine();
		
		while(!verificarCep(cep)) {
			System.out.println("Campo obrigatório: CEP!");
			System.out.println("Informe o CEP do cliente novamente:");
			cep = entrada.nextLine();
			}
		
		while(!validarCep(cep)) {
			System.out.println("CEP inválido! Digite apenas números!");
			System.out.println("Informe o cep do cliente novamente:");
			cep = entrada.nextLine();
			}
		
		System.out.println("\nInforme o CPF do cliente: ");
		cpf = entrada.nextLine();
		
		while(!verificarCpf(cpf)) {
			System.out.println("Campo obrigatório: CPF!");
			System.out.println("Informe o CPF do cliente novamente:");
			cpf = entrada.nextLine();
			}
		
		while(!validarCpf(cpf)) {
			System.out.println("CPF inválido! Digite apenas números, o cep deve conter 11 números...");
			System.out.println("Informe o CPF do cliente novamente:");
			cpf = entrada.nextLine();
			}

		System.out.println("\nInforme o RG do cliente: ");
		rg = entrada.nextLine();
		
		while(!verificarRg(rg)) {
			System.out.println("Campo obrigatório: RG!");
			System.out.println("Informe o RG do cliente novamente:");
			rg = entrada.nextLine();
			}
		
		while(!validarRg(rg)) {
			System.out.println("RG inválido! Digite apenas números. RG contém apenas 7 números.");
			System.out.println("Informe o RG do cliente novamente:");
			rg = entrada.nextLine();
			}

		System.out.println("\nInforme o Órgão Emissor do cliente: ");
		orgãoEmissor = entrada.nextLine();
		
		while(!verificarOrgao(orgãoEmissor)) {
			System.out.println("Campo obrigatório: Órgão emissor!");
			System.out.println("Informe o Órgão emissor do cliente novamente:");
			orgãoEmissor = entrada.nextLine();
			}
		
		while(!validarOrgao(orgãoEmissor)) {
			System.out.println("Órgão Emissor inválido!");
			System.out.println("Informe o Órgão Emissor do cliente, sem acentuação,  novamente:");
			orgãoEmissor = entrada.nextLine();
			}
		
		System.out.println("\nInforme a data de nascimento do cliente: ");
		dataNascimento = entrada.nextLine();
		
		while(!verificarNascimento(dataNascimento)) {
			System.out.println("Campo obrigatório: Data de nascimento!");
			System.out.println("Informe a data de nascimento do cliente novamente:");
			dataNascimento = entrada.nextLine();
			}
		
		while(!validarNascimento(dataNascimento)) {
			System.out.println("Data de nascimento inválida!");
			System.out.println("Informe a data de nascimento do cliente novamente:");
			dataNascimento = entrada.nextLine();
			}

		System.out.println("\nInforme o estado civil do cliente: ");
		estadoCivil = entrada.nextLine();
		
		while(!verificarEstadoCivil(estadoCivil)) {
			System.out.println("Campo obrigatório: Estado Civil!");
			System.out.println("Informe o estado civil do cliente novamente:");
			estadoCivil = entrada.nextLine();
			}
		
		while(!validarEstadoCivil(estadoCivil)) {
			System.out.println("Estado Civil inválido!");
			System.out.println("Informe o estado civil do cliente, sem acentuação, novamente:");
			estadoCivil = entrada.nextLine();
			}

		System.out.println("\nInforme o email do cliente: ");
		email = entrada.nextLine();
		
		while(!verificarEmail(email)) {
			System.out.println("Campo obrigatório: Email!");
			System.out.println("Informe o email do cliente novamente:");
			email = entrada.nextLine();
			}
		
		while(!validarEmail(email)) {
			System.out.println("Email inválido!");
			System.out.println("Informe o email do cliente novamente:");
			email = entrada.nextLine();
			}	

		System.out.println("\nInforme um ponto de referência do cliente: ");
		pontoDeReferencia = entrada.nextLine();
		
		while(!verificarPonto(pontoDeReferencia)) {
			System.out.println("Campo obrigatório: Ponto de Referência!");
			System.out.println("Informe um ponto de referência do cliente novamente:");
			pontoDeReferencia = entrada.nextLine();
			}
		
		while(!validarPonto(pontoDeReferencia)) {
			System.out.println("Ponto de referência inválido!");
			System.out.println("Informe um ponto de referência do cliente novamente:");
			pontoDeReferencia = entrada.nextLine();
			}	

		System.out.println("\nInforme a firma do cliente: ");
		firma = entrada.nextLine();
		
		while(!verificarFirma(firma)) {
			System.out.println("Campo obrigatório: Firma!");
			System.out.println("Informe a firma do cliente novamente:");
			firma = entrada.nextLine();
			}
		
		while(!validarFirma(firma)) {
			System.out.println("Firma inválida!");
			System.out.println("Informe a firma do cliente, sem acentuação, novamente:");
			firma = entrada.nextLine();
			}	

		System.out.println("\nInforme o telefone da firma do cliente: ");
		foneFirma = entrada.nextLine();
		
		while(!verificarFoneFirma(foneFirma)) {
			System.out.println("Campo obrigatório: Telefone da Firma!");
			System.out.println("Informe o telefone da firma do cliente novamente:");
			foneFirma = entrada.nextLine();
			}
		
		while(!validarFoneFirma(foneFirma)) {
			System.out.println("Telefone da firma inválido!");
			System.out.println("Informe o telefone da firma do cliente novamente:");
			foneFirma = entrada.nextLine();
			}	
		
		System.out.println("\nInforme o tempo de firma do cliente: ");
		tempo = entrada.nextLine();
		
		while(!verificarTempo(tempo)) {
			System.out.println("Campo obrigatório: Telefone da Firma!");
			System.out.println("Informe o tempo de firma do cliente novamente:");
			tempo = entrada.nextLine();
			}

		System.out.println("\nInforme o endereço da firma do cliente: ");
		enderecoFirma = entrada.nextLine();
		
		while(!verificarEnderecoFirma(enderecoFirma)) {
			System.out.println("Campo obrigatório: Endereço da Firma!");
			System.out.println("Informe o endereço da firma do cliente novamente:");
			enderecoFirma = entrada.nextLine();
			}
			
		System.out.println("\nInforme o setor da firma do cliente: ");
		setorFirma = entrada.nextLine();
		
		while(!verificarSetorFirma(setorFirma)) {
			System.out.println("Campo obrigatório: Setor da Firma!");
			System.out.println("Informe o setor da firma do cliente novamente:");
			setorFirma = entrada.nextLine();
			}
		
		while(!validarSetorFirma(setorFirma)) {
			System.out.println("Setor da firma inválido!");
			System.out.println("Informe o setor da firma do cliente, sem acentuação, novamente:");
			setorFirma = entrada.nextLine();
			}

		System.out.println("\nInforme a cidade da firma do cliente: ");
		cidadeFirma = entrada.nextLine();
		
		while(!verificarCidadeFirma(cidadeFirma)) {
			System.out.println("Campo obrigatório: Cidade da Firma!");
			System.out.println("Informe a cidade da firma do cliente novamente:");
			cidadeFirma = entrada.nextLine();
			}
		
		while(!validarCidadeFirma(cidadeFirma)) {
			System.out.println("Cidade da firma inválida!");
			System.out.println("Informe a cidade da firma do cliente, sem acentuação, novamente:");
			cidadeFirma = entrada.nextLine();
			}

		System.out.println("\nInforme o estado da firma do cliente: ");
		estadoFirma = entrada.nextLine();
		
		while(!verificarEstadoFirma(estadoFirma)) {
			System.out.println("Campo obrigatório: Estado da Firma!");
			System.out.println("Informe o estado da firma do cliente novamente:");
			estadoFirma = entrada.nextLine();
			}
		
		while(!validarEstadoFirma(estadoFirma)) {
			System.out.println("Estado da firma inválido!");
			System.out.println("Informe o estado da firma do cliente, sem acentuação, novamente:");
			estadoFirma = entrada.nextLine();
			}

		System.out.println("\nInforme a seção da firma do cliente: ");
		secaoFirma = entrada.nextLine();
		
		while(!verificarSecaoFirma(secaoFirma)) {
			System.out.println("Campo obrigatório: Seção da Firma!");
			System.out.println("Informe a seção da firma do cliente novamente:");
			secaoFirma = entrada.nextLine();
			}
		
		while(!validarSecaoFirma(secaoFirma)) {
			System.out.println("Seção da firma inválida!");
			System.out.println("Informe a seção da firma do cliente novamente:");
			secaoFirma = entrada.nextLine();
			}

		System.out.println("\nInforme o cargo na firma do cliente: ");
		cargo = entrada.nextLine();
		
		while(!verificarCargo(cargo)) {
			System.out.println("Campo obrigatório: Cargo!");
			System.out.println("Informe o cargo na firma do cliente novamente:");
			cargo = entrada.nextLine();
			}
		
		while(!validarCargo(cargo)) {
			System.out.println("Cargo na firma inválido!");
			System.out.println("Informe o cargo na firma do cliente, sem acentuação, novamente:");
			cargo = entrada.nextLine();
			}

		System.out.println("\nInforme o banco do cliente: ");
		banco = entrada.nextLine();
		
		while(!verificarBanco(banco)) {
			System.out.println("Campo obrigatório: Banco!");
			System.out.println("Informe o banco do cliente novamente:");
			banco = entrada.nextLine();
			}
		
		while(!validarBanco(banco)) {
			System.out.println("Banco inválido!");
			System.out.println("Informe o banco do cliente, sem acentuação, novamente:");
			banco = entrada.nextLine();
			}

		System.out.println("\nInforme a agência do cliente: ");
		agencia = entrada.nextLine();
		
		while(!verificarAgencia(agencia)) {
			System.out.println("Campo obrigatório: Agência!");
			System.out.println("Informe a agência do cliente novamente:");
			agencia = entrada.nextLine();
			}
		
		while(!validarAgencia(agencia)) {
			System.out.println("Agência inválida!");
			System.out.println("Informe a agência do cliente novamente, com números:");
			agencia = entrada.nextLine();
			}

		System.out.println("\nInforme a Filiação Pai do cliente: ");
		filiacaoPai = entrada.nextLine();
		
		while(!verificarFiliacaoPai(filiacaoPai)) {
			System.out.println("Campo obrigatório: Filiação Pai!");
			System.out.println("Informe a Filiação Pai do cliente novamente:");
			filiacaoPai = entrada.nextLine();
			}
		
		while(!validarFiliacaoPai(filiacaoPai)) {
			System.out.println("Filiação Pai inválida!");
			System.out.println("Informe a Filiação Pai do cliente novamente:");
			filiacaoPai = entrada.nextLine();
			}

		System.out.println("\nInforme o nome da Mãe do cliente: ");
		nomeMae = entrada.nextLine();
		
		while(!verificarNome(nomeMae)) {
			System.out.println("Campo obrigatório: Nome da Mãe!");
			System.out.println("Informe o nome da mãe do cliente novamente:");
			nomeMae = entrada.nextLine();
			}
		
		while(!validarNome(nomeMae)) {
			System.out.println("Nome da mãe inválido! Digite apenas letras!");
			System.out.println("Informe o nome da mãe do cliente, sem acentuação, novamente:");
			nomeMae = entrada.nextLine();
			}

		System.out.println("\nInforme a Inf. Comercial do cliente: ");
		infComercial = entrada.nextLine();
		
		while(!verificarInfComercial(infComercial)) {
			System.out.println("Campo obrigatório: Inf. Comercial!");
			System.out.println("Informe a Inf. Comercial do cliente novamente:");
			infComercial = entrada.nextLine();
			}
		
		while(!validarInfComercial(infComercial)) {
			System.out.println("Inf. Comercial inválida!");
			System.out.println("Informe a Inf. Comercial do cliente novamente:");
			infComercial = entrada.nextLine();
			}

		System.out.println("\nInforme o nome da primeira pessoa referencial do cliente: ");
		nome1 = entrada.nextLine();
		
		while(!verificarNome(nome1)) {
			System.out.println("Campo obrigatório: Nome da primerira pessoa referencial!");
			System.out.println("Informe o nome da primeira pessoa referencial do cliente novamente:");
			nome1 = entrada.nextLine();
			}
		
		while(!validarNome(nome1)) {
			System.out.println("Nome inválido! Digite apenas letras!");
			System.out.println("Informe o nome da primeira pessoa referencial do cliente, sem acentuação, novamente:");
			nome1 = entrada.nextLine();
			}

		System.out.println("\nInforme o telefone da primeira pessoa referencial do cliente: ");
		telefone1 = entrada.nextLine();
		
		while(!verificarTelefone(telefone1)) {
			System.out.println("Campo obrigatório: Telefone referencial da primeira pessoa!");
			System.out.println("Informe o telefone referencial da primeira pessoa do cliente novamente:");
			telefone1 = entrada.nextLine();
			}
		
		while(!validarTelefone(telefone1)) {
			System.out.println("Telefone inválido! Digite apenas números, contendo o DDD.");
			System.out.println("Informe o telefone da primeira pessoa referencial do cliente novamente:");
			telefone1 = entrada.nextLine();
			}

		System.out.println("\nInforme o endereço da primeira pessoa referencial do cliente: ");
		endereco1 = entrada.nextLine();
		
		while(!verificarEndereco(endereco1)) {
			System.out.println("Campo obrigatório: Endereço!");
			System.out.println("Informe o endereço da primeira pessoa referencial do cliente novamente:");
			endereco1 = entrada.nextLine();
			}

		System.out.println("\nInforme o nome da segunda pessoa referencial do cliente: ");
		nome2 = entrada.nextLine();
		
		while(!verificarNome(nome2)) {
			System.out.println("Campo obrigatório: Nome da segunda pessoa referencial!");
			System.out.println("Informe o nome da segunda pessoa referencial do cliente novamente:");
			nome2 = entrada.nextLine();
			}
		
		while(!validarNome(nome2)) {
			System.out.println("Nome inválido! Digite apenas letras!");
			System.out.println("Informe o nome da segunda pessoa referencial do cliente, sem acentuação, novamente:");
			nome2 = entrada.nextLine();
			}

		System.out.println("\nInforme o telefone da segunda pessoa referencial do cliente: ");
		telefone2 = entrada.nextLine();
		
		while(!verificarTelefone(telefone2)) {
			System.out.println("Campo obrigatório: Telefone referencial da segunda pessoa!");
			System.out.println("Informe o telefone referencial da segunda pessoa do cliente novamente:");
			telefone2 = entrada.nextLine();
			}
		
		while(!validarTelefone(telefone2)) {
			System.out.println("Telefone inválido! Digite apenas números, contendo o DDD.");
			System.out.println("Informe o telefone da segunda pessoa referencial do cliente novamente:");
			telefone2 = entrada.nextLine();
			}

		System.out.println("\nInforme o endereço da segunda pessoa referencial do cliente: ");
		endereco2 = entrada.nextLine();
		
		while(!verificarEndereco(endereco2)) {
			System.out.println("Campo obrigatório: Endereço!");
			System.out.println("Informe o endereço da segunda pessoa referencial do cliente novamente:");
			endereco2 = entrada.nextLine();
			}

		imprimirDados(nome, telefone, endereco, setor, cidade, estado, cep, cpf, rg, orgãoEmissor, dataNascimento,
		estadoCivil, email, pontoDeReferencia, firma, foneFirma, tempo, enderecoFirma, setorFirma, cidadeFirma,
		estadoFirma, secaoFirma, cargo, banco, agencia, filiacaoPai, nomeMae, infComercial, nome1, telefone1,
		endereco1, nome2, telefone2, endereco2);
		
		System.out.println("Deseja cadastrar novo cliente? (SIM) ou (NÃO): ");
		resposta = entrada.nextLine();
		
		}
		
		System.out.println("===== Obrigado por utilizar nossos serviços! =====	");
	}
}