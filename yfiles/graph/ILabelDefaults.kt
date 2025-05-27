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
import yfiles.styles.ILabelStyle

/**
 * Interface used by [IGraph] and the like to declare and obtain the defaults for labels.
 * @see [INodeDefaults.labels]
 * @see [IEdgeDefaults.labels]
 * @see [IGraph.nodeDefaults]
 * @see [IGraph.edgeDefaults]
 * @see [IGraph.groupNodeDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelDefaults">Online Documentation</a>
 */
external interface ILabelDefaults  {
  /**
   * Gets or sets a property that determines whether to automatically adjust the preferred size of a label.
   * @see [ILabelStyleRenderer.getPreferredSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelDefaults%23autoAdjustPreferredSize">Online Documentation</a>
   */
  var autoAdjustPreferredSize: Boolean
  
  /**
   * Gets or sets the label model parameter to use for labels.
   * @see [shareLayoutParameterInstance]
   * @see [getLayoutParameterInstance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelDefaults%23layoutParameter">Online Documentation</a>
   */
  var layoutParameter: ILabelModelParameter
  
  /**
   * Gets or sets a value indicating whether the [layoutParameter][ILabelDefaults] instance should be shared referentially or [cloned][yfiles.lang.ICloneable] upon a call to [getLayoutParameterInstance][ILabelDefaults].
   * @see [getLayoutParameterInstance]
   * @see [layoutParameter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelDefaults%23shareLayoutParameterInstance">Online Documentation</a>
   */
  var shareLayoutParameterInstance: Boolean
  
  /**
   * Gets or sets a value indicating whether the [style][ILabelDefaults] instance should be shared referentially or [cloned][yfiles.lang.ICloneable] upon a call to [getStyleInstance][ILabelDefaults].
   * @see [getStyleInstance]
   * @see [style]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelDefaults%23shareStyleInstance">Online Documentation</a>
   */
  var shareStyleInstance: Boolean
  
  /**
   * Gets or sets the style to use for labels.
   * @see [shareStyleInstance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelDefaults%23style">Online Documentation</a>
   */
  var style: ILabelStyle
  
  /**
   * Factory method that returns a label model parameter instance for use with newly created labels.
   * @param [owner] The owner of the label that will be created.
   * @return The parameter to use, which for most implementations is either a [clone][yfiles.lang.ICloneable] of or the [layoutParameter][ILabelDefaults] property, if [shareLayoutParameterInstance][ILabelDefaults] is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelDefaults%23ILabelDefaults-method-getLayoutParameterInstance">Online Documentation</a>
   */
  fun getLayoutParameterInstance(
    owner: ILabelOwner,
  ): ILabelModelParameter
  
  /**
   * Factory method that returns a style instance for use with newly created labels.
   * @param [owner] The owner of the label that will be created.
   * @return The style to use, which for most implementations is either a [clone][yfiles.lang.ICloneable] of or the [style][ILabelDefaults] property, if [shareStyleInstance][ILabelDefaults] is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelDefaults%23ILabelDefaults-method-getStyleInstance">Online Documentation</a>
   */
  fun getStyleInstance(
    owner: ILabelOwner,
  ): ILabelStyle

  
  companion object : InterfaceMetadata<ILabelDefaults> {
  }
}
