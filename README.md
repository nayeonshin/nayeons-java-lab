# Nayeon's Java Lab ☕

Nayeon's Java Lab is where I experiment with Java.  

Note that some TILs are not specific to Java.

<details>
    <summary>🧪 TILs</summary>
    <ul>
        <li><code>Lengths.java</code>: Escape characters don't count towards the length of a string.</li>
        <li><code>Equality.java</code>: When two or more strings with the same value are created without <code>new</code>, then <code>==</code> can be used to compare their values.
        </li>
        <li><code>ShortCircuitOperators.java</code>: <code>&&</code> and <code>||</code> are short-circuit operators. If <code>X</code> is <code>false</code> in <code>X && Y</code>, then <code>Y</code> is not evaluated. If <code>X</code> is <code>true</code> in <code>X || Y</code>, then <code>Y</code> is not evaluated.</li>
        <li><code>NegativeMod.java</code>: There are 2 ways to find a mod with a negative number. The inefficient way is to add the divisor to the difference (minuend - subtrahend) until the result becomes positive. The efficient way is to make the difference positive when it's negative, get the remainder <code>difference % divisor</code>. Then, the result of mod is <code>divisor - remainder</code>.</li>
    </ul>
</details>
