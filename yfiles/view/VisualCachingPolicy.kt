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
 * Determines the policy whether and how [Visual]s are cached when they are removed temporarily from the [CanvasComponent]'s render tree.
 * @see [IRenderContext.setDisposeCallback]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VisualCachingPolicy">Online Documentation</a>
 */

sealed external class VisualCachingPolicy {
  /**
   * Disables caching of [Visual]s completely.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VisualCachingPolicy%23NEVER">Online Documentation</a>
   */
  object NEVER: VisualCachingPolicy
  
  /**
   * [Visual]s will always be cached.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VisualCachingPolicy%23ALWAYS">Online Documentation</a>
   */
  object ALWAYS: VisualCachingPolicy
}
