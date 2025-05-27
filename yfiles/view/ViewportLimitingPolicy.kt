// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

/**
 * Defines how [ViewportLimiter] should [limit][ViewportLimiter] the suggested [viewport][CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimitingPolicy">Online Documentation</a>
 */

sealed external class ViewportLimitingPolicy {
  /**
   * Strictly applies the bounds.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimitingPolicy%23STRICT">Online Documentation</a>
   */
  object STRICT: ViewportLimitingPolicy
  
  /**
   * If the current [viewport][CanvasComponent] lies outside the [bounds][ViewportLimiter] the [ViewportLimiter] allows for changes towards the [bounds][ViewportLimiter] but forbids changes away from them.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimitingPolicy%23TOWARDS_LIMIT">Online Documentation</a>
   */
  object TOWARDS_LIMIT: ViewportLimitingPolicy
  
  /**
   * This policy strictly limits the viewport to ensure that [bounds][ViewportLimiter] always is contained at least within the [viewportContentMargins][ViewportLimiter].
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimitingPolicy%23WITHIN_MARGINS">Online Documentation</a>
   */
  object WITHIN_MARGINS: ViewportLimitingPolicy
  
  /**
   * This policy basically disables limiting of the viewport.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimitingPolicy%23UNRESTRICTED">Online Documentation</a>
   */
  object UNRESTRICTED: ViewportLimitingPolicy
}
