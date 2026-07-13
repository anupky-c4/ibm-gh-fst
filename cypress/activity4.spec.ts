import { expect, test } from "@playwright/test";

test("Activity 3", async ({ page }) => {
  // Go to the page
  await page.goto("https://training-support.net/webelements/drag-drop");
  const title = await page.title();
  console.log(`The title of the page is: ${title}`);
  const ball=page.getByTestId("ball");
  const dzone1=page.getByTestId("dropzone1");
  const dzone2=page.getByTestId("dropzone2");
  await ball.dragTo(dzone1);
  await expect(dzone1).toHaveText(/Dropped/);
  await ball.dragTo(dzone2);
  await expect(dzone2).toHaveText(/Dropped/);
});