import { test } from "@playwright/test";

test("Activity 3", async ({ page }) => {
  // Go to the page
  await page.goto("https://training-support.net/webelements/target-practice");
  const title = await page.title();
  console.log(`The title of the page is: ${title}`);
  const cyan_button_text = await page.getByRole("button").filter({ hasText: "Cyan" })
    .textContent();
  console.log(`The cyan button's text is: ${cyan_button_text}`);
  const sixth_heading = page.getByText("Heading #6");
  console.log(
    `The 6th heading has the following classes: ${await sixth_heading.getAttribute("class")}`
  );
  const fifth_heading = page.getByText("Heading #5");
  console.log(
    "The color of the 5th heading is: " +
      (await fifth_heading.evaluate((heading) => {
        return window.getComputedStyle(heading).getPropertyValue("color");
      }))
  );
  const pink_button = page.getByRole("button").filter({ hasText: "Pink" });
  const pink_button_dimensions = await pink_button.boundingBox();
  console.log(
    `The dimensions of the pink button are: ${pink_button_dimensions?.width}x${pink_button_dimensions?.height}`
  );
});