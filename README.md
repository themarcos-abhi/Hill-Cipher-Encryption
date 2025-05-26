###HillCipher
📌 Overview
HillCipher.java is a Java implementation of the Hill Cipher, a classical polygraphic substitution cipher based on linear algebra. This program allows users to encrypt and decrypt messages using a square matrix key.

💡 What is the Hill Cipher?
The Hill Cipher was invented by Lester S. Hill in 1929. It uses matrix multiplication modulo 26 to transform plaintext into ciphertext. It operates on blocks of letters and uses linear algebra concepts like matrix multiplication and inversion.

🛠 Features
Encrypts plaintext using an n x n key matrix.

Decrypts ciphertext using the inverse of the key matrix.

Validates key matrix for invertibility (mod 26).

Accepts only alphabetic characters and ignores spaces/punctuation.
📥 Input Requirements
The key must be a square matrix (e.g., 2x2, 3x3).

Matrix values must be integers between 0 and 25 (representing letters A-Z).

The key matrix must be invertible modulo 26.

📤 Output
Encrypted ciphertext in uppercase.

Decrypted plaintext (converted from ciphertext).

📚 Dependencies
No external libraries needed. Pure Java implementation.
