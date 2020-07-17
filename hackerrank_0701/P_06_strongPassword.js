function minimumNumber(n, password) {
  const numbers = "0123456789";
  const lower_case = "abcdefghijklmnopqrstuvwxyz";
  const upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  const special_characters = "!@#$%^&*()-+";

  let isContainsDigit = false;
  let isContainsLowerCase = false;
  let isContainsUpperCase = false;
  let isContainsSpecialCh = false;
  let numsMissingAmount = 0;
  let numsMissingTyps = 0;

  for (let i = 0; i < n; i++) {
    if (numbers.includes(password.charAt(i))) {
      isContainsDigit = true;
    } else if (lower_case.includes(password.charAt(i))) {
      isContainsLowerCase++;
    } else if (upper_case.includes(password.charAt(i))) {
      isContainsUpperCase++;
    } else if (special_characters.includes(password.charAt(i))) {
      isContainsSpecialCh++;
    }
  }
  if (!isContainsDigit) {
    numsMissingAmount++;
  }
  if (!isContainsLowerCase) {
    numsMissingAmount++;
  }
  if (!isContainsUpperCase) {
    numsMissingAmount++;
  }
  if (!isContainsSpecialCh) {
    numsMissingAmount++;
  }
  if (!n.length < 6) {
    numsMissingTyps = 6 - n;
  }

  return numsMissingTyps > numsMissingAmount
    ? numsMissingTyps
    : numsMissingAmount;
}

console.log(minimumNumber(5, "ccccc"));
