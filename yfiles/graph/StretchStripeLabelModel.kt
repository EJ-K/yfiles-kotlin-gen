// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ILookup
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata

/**
 * A label model for stripe labels which supports the possible header positions of [IRow]s and [IColumn]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-constructor-StretchStripeLabelModel">Online Documentation</a>
 */
open external class StretchStripeLabelModel () : ILabelModel {
  /**
   * Gets or sets the padding to use within the stripe's [layout][IStripe].
   * 
   * The default is `(2,2,2,2)`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23padding">Online Documentation</a>
   */
  open var padding: Insets
  
  /**
   * Gets or sets a value indicating whether to use the [global padding][IStripe] or the normal [padding][IStripe] of a stripe for centering the label inside the stripe header area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23useTotalPadding">Online Documentation</a>
   */
  open var useTotalPadding: Boolean
  
  /**
   * Creates the parameter for the given position.
   * @param [position] The position.
   * @return The parameter for the given position.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-createParameter">Online Documentation</a>
   */
  open fun createParameter(
    position: StretchStripeLabelModelPosition,
  ): StretchStripeLabelModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * Calculates the geometry in the form of an [IOrientedRectangle] for a given label using the given model parameter.
   * @param [label] The label to calculate the geometry for
   * @param [layoutParameter] A parameter that has been created by this model. This is typically the parameter that yielded this instance through its [model][ILabelModelParameter] property.
   * @return An instance that describes the geometry. This is typically an instance designed as a flyweight, so clients should not cache the instance but store the values if they need a snapshot for later use
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-getGeometry">Online Documentation</a>
   */
  final override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<StretchStripeLabelModel> {
    /**
     * A predefined parameter instance that places a label inside the bottom header of a column.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23BOTTOM">Online Documentation</a>
     */
     val BOTTOM: StretchStripeLabelModelParameter
    
    /**
     * A predefined parameter instance that places a label inside the left header of a row.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23LEFT">Online Documentation</a>
     */
     val LEFT: StretchStripeLabelModelParameter
    
    /**
     * A predefined parameter instance that places a label inside the right header of a row.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23RIGHT">Online Documentation</a>
     */
     val RIGHT: StretchStripeLabelModelParameter
    
    /**
     * A predefined parameter instance that places a label inside the top header of a column.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23TOP">Online Documentation</a>
     */
     val TOP: StretchStripeLabelModelParameter
  }
}

inline fun StretchStripeLabelModel(
    block: StretchStripeLabelModel.() -> Unit
): StretchStripeLabelModel {
    return StretchStripeLabelModel()
        .apply(block)
}
