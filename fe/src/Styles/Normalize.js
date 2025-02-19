import { createGlobalStyle } from "styled-components";

const Normalize = createGlobalStyle`
  .App, #modal, #alertPopup {
    font-family: "Noto Sans KR", sans-serif;
  }
  
  h1 {
    font-family: "Outfit", sans-serif;
    font-weight: 900;
    font-size: 40px;
    line-height: 50px;
  }

  h2 {
  ${({ theme: { boldFonts } }) => boldFonts.xxLarge}
  }

  button {
    font-family: "Noto Sans KR", sans-serif;
    cursor: pointer;
  }
`;

export default Normalize;
