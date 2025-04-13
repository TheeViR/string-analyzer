import React, { useState } from "react";
import { analyzeString } from "../services/api";

const operations = [
  { value: "reverse", label: "Reverse" },
  { value: "palindrome", label: "Palindrome Check" },
  { value: "counter", label: "Word & Character Count" },
  { value: "compress", label: "Compress the String" },
  { value: "camelcase", label: "Convert to camelCase" },
  { value: "uppercase", label: "Convert to Uppercase" },
  { value: "lowercase", label: "Convert to Lowercase" },
  { value: "vowelconsonant", label: "Vowel & Consonant Count" },
  { value: "pangram", label: "Check if Pangram" },
  { value: "frequency", label: "Character Frequency" },
];

const AnalyzerForm = () => {
  const [input, setInput] = useState("");
  const [operation, setOperation] = useState("");
  const [result, setResult] = useState("");
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  const handleAnalyze = async () => {
    setError("");
    if (!operation || !input.trim()) {
      setError("Please enter valid input and select an operation.");
      return;
    }

    try {
      setLoading(true);
      const res = await analyzeString(operation, input.trim());
      setResult(res.data);
    } catch (err) {
      setError("Something went wrong while analyzing the string.");
    } finally {
      setLoading(false);
    }
  };

  const clearAll = () => {
    setInput("");
    setOperation("");
    setResult("");
    setError("");
  };

  return (
    <div className="bg-gray-700 p-6 rounded-2xl shadow-lg w-full max-w-md space-y-4">
      <h1 className="text-2xl font-bold text-center text-amber-400">🔠 String Analyzer</h1>

      <input
        type="text"
        placeholder="Enter your string..."
        className="w-full p-2 border rounded text-amber-200 hover:border-indigo-400"
        value={input}
        onChange={(e) => setInput(e.target.value)}
      />

      <select
        className="cursor-pointer w-full p-2 border rounded bg-amber-400 hover:bg-amber-600"
        value={operation}
        onChange={(e) => setOperation(e.target.value)}
      >
        <option value="">-- Select Operation --</option>
        {operations.map((op) => (
          <option key={op.value} value={op.value}>{op.label}</option>
        ))}
      </select>

      <div className="flex space-x-2">
        <button
          onClick={handleAnalyze}
          className="flex-1 bg-amber-300 text-black px-4 py-2 rounded hover:bg-amber-600 transition"
        >
          {loading ? "Analyzing..." : "Analyze"}
        </button>
        <button
          onClick={clearAll}
          className="flex-1 bg-gray-300 text-black px-4 py-2 rounded hover:bg-gray-400 transition"
        >
          Clear
        </button>
      </div>

      {error && <p className="text-red-400 text-center">{error}</p>}
      {result && (
        <div className="bg-gray-500 border mt-2 p-3 rounded text-center text-sm text-gray-800 hover:bg-black overflow-auto">
          <p className="text-xl text-green-400 font-bold hover:text-white whitespace-pre-wrap">{result}</p>
        </div>
      )}
    </div>
  );
};

export default AnalyzerForm;
