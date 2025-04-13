import axios from "axios";

const API = axios.create({
  baseURL: import.meta.env.VITE_API_BASE_URL || "http://localhost:8080",
});

export const analyzeString = (operation, input) => {
  return API.get(`/${operation}`, {
    params: { input },
  });
};
