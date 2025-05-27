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
 * Policy to determine at which visual layer node and edge ports shall be inserted by the [GraphModelManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLayerPolicy">Online Documentation</a>
 */

sealed external class PortLayerPolicy {
  /**
   * The ports will be visualized directly on top of their owner.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLayerPolicy%23AT_OWNER">Online Documentation</a>
   */
  object AT_OWNER: PortLayerPolicy
  
  /**
   * All ports will be visualized in the [portGroup][GraphModelManager].
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLayerPolicy%23SEPARATE_LAYER">Online Documentation</a>
   */
  object SEPARATE_LAYER: PortLayerPolicy
}
