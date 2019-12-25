import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> listOfProteins = new List<String>() {
        }
    }
}

/*

Codon                 | Protein
:---                  | :---
AUG                   | Methionine
UUU, UUC              | Phenylalanine
UUA, UUG              | Leucine
UCU, UCC, UCA, UCG    | Serine
UAU, UAC              | Tyrosine
UGU, UGC              | Cysteine
UGG                   | Tryptophan
UAA, UAG, UGA         | STOP

 */