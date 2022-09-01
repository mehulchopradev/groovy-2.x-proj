def ch = 'z'

// switch case
// supports fall through

switch(ch) {
  case 'a':
  case 'e':
  case 'i':
  case 'o':
  case 'u': println 'Is a Vowel'
            break
  default: println 'Is not a Vowel'
}