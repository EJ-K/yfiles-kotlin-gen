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
import yfiles.styles.IPortStyle

/**
 * Interface used by [IGraph] to declare and obtain the defaults for ports at nodes and edges.
 * @see [IPort]
 * @see [INodeDefaults.ports]
 * @see [IEdgeDefaults.ports]
 * @see [IGraph.nodeDefaults]
 * @see [IGraph.edgeDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults">Online Documentation</a>
 */
external interface IPortDefaults  {
  /**
   * Gets or sets whether unused ports should automatically be removed from their owners as soon as no further edge is connected to them.
   * @see [IGraph.remove]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults%23autoCleanUp">Online Documentation</a>
   */
  var autoCleanUp: Boolean
  
  /**
   * Gets or sets the defaults for labels at ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults%23labels">Online Documentation</a>
   */
  var labels: ILabelDefaults
  
  /**
   * Gets or sets the location model parameter to use for ports.
   * @see [shareLocationParameterInstance]
   * @see [getLocationParameterInstance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults%23locationParameter">Online Documentation</a>
   */
  var locationParameter: IPortLocationModelParameter
  
  /**
   * Gets or sets a value indicating whether the [locationParameter][IPortDefaults] instance should be shared referentially or [cloned][yfiles.lang.ICloneable] upon a call to [getLocationParameterInstance][IPortDefaults].
   * @see [getLocationParameterInstance]
   * @see [locationParameter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults%23shareLocationParameterInstance">Online Documentation</a>
   */
  var shareLocationParameterInstance: Boolean
  
  /**
   * Gets or sets a value indicating whether the [style][IPortDefaults] instance should be shared referentially or [cloned][yfiles.lang.ICloneable] upon a call to [getStyleInstance][IPortDefaults].
   * @see [getStyleInstance]
   * @see [style]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults%23shareStyleInstance">Online Documentation</a>
   */
  var shareStyleInstance: Boolean
  
  /**
   * Gets or sets the style to use for ports.
   * @see [shareStyleInstance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults%23style">Online Documentation</a>
   */
  var style: IPortStyle
  
  /**
   * Factory method that returns a location model parameter instance for use with newly created ports.
   * @param [owner] The owner of the port that will be created.
   * @return The parameter to use, which for most implementations is either a [clone][yfiles.lang.ICloneable] or the [locationParameter][IPortDefaults] property if [shareLocationParameterInstance][IPortDefaults] is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults%23IPortDefaults-method-getLocationParameterInstance">Online Documentation</a>
   */
  fun getLocationParameterInstance(
    owner: IPortOwner,
  ): IPortLocationModelParameter
  
  /**
   * Factory method that returns a style instance for use with newly created ports.
   * @param [owner] The owner of the port that will be created.
   * @return The style to use, which for most implementations is either a [clone][yfiles.lang.ICloneable] of or the [style][IPortDefaults] property, if [shareStyleInstance][IPortDefaults] is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortDefaults%23IPortDefaults-method-getStyleInstance">Online Documentation</a>
   */
  fun getStyleInstance(
    owner: IPortOwner,
  ): IPortStyle

  
  companion object : InterfaceMetadata<IPortDefaults> {
  }
}
