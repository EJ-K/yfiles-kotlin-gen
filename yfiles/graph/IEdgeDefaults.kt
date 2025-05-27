// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata
import yfiles.styles.IEdgeStyle

/**
 * Interface used by [IGraph] to declare and obtain the defaults for edges and their labels and ports.
 * @see [IGraph.edgeDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeDefaults">Online Documentation</a>
 */
external interface IEdgeDefaults  {
  /**
   * Gets or sets the defaults for labels at edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeDefaults%23labels">Online Documentation</a>
   */
  var labels: ILabelDefaults
  
  /**
   * Gets or sets the defaults for ports at edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeDefaults%23ports">Online Documentation</a>
   */
  var ports: IPortDefaults
  
  /**
   * Gets or sets a value indicating whether the [style][IEdgeDefaults] instance should be shared referentially or [cloned][yfiles.lang.ICloneable] upon a call to [getStyleInstance][IEdgeDefaults].
   * @see [getStyleInstance]
   * @see [style]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeDefaults%23shareStyleInstance">Online Documentation</a>
   */
  var shareStyleInstance: Boolean
  
  /**
   * Gets or sets the style to use for edges.
   * @see [shareStyleInstance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeDefaults%23style">Online Documentation</a>
   */
  var style: IEdgeStyle
  
  /**
   * Factory method that returns a style instance for use with newly created edges.
   * @return The style to use, which for most implementations is either a [clone][yfiles.lang.ICloneable] of or the [style][IEdgeDefaults] property, if [shareStyleInstance][IEdgeDefaults] is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeDefaults%23IEdgeDefaults-method-getStyleInstance">Online Documentation</a>
   */
  fun getStyleInstance(): IEdgeStyle

  
  companion object : InterfaceMetadata<IEdgeDefaults> {
  }
}
