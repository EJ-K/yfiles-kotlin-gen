// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata
import yfiles.styles.IEdgeStyle

/**
 * A canonical implementation of the [IEdgeDefaults] interface
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDefaults">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [EdgeDefaults] class with default edge style, label, and port defaults.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDefaults%23EdgeDefaults-constructor-EdgeDefaults">Online Documentation</a>
 */
open external class EdgeDefaults () : IEdgeDefaults {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDefaults%23labels">Online Documentation</a>
   */
  final override var labels: ILabelDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDefaults%23ports">Online Documentation</a>
   */
  final override var ports: IPortDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDefaults%23shareStyleInstance">Online Documentation</a>
   */
  final override var shareStyleInstance: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDefaults%23style">Online Documentation</a>
   */
  final override var style: IEdgeStyle
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDefaults%23EdgeDefaults-method-getStyleInstance">Online Documentation</a>
   */
  override fun getStyleInstance(): IEdgeStyle
  
  companion object : ClassMetadata<EdgeDefaults> {
  }
}

inline fun EdgeDefaults(
    block: EdgeDefaults.() -> Unit
): EdgeDefaults {
    return EdgeDefaults()
        .apply(block)
}
