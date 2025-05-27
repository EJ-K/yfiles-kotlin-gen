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
import yfiles.lang.ClassMetadata

/**
 * A label model for stripe labels which supports the possible header positions of [IRow]s and [IColumn]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this model with zero padding.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23StripeLabelModel-constructor-StripeLabelModel">Online Documentation</a>
 */
open external class StripeLabelModel () : ILabelModel {
  /**
   * Gets or sets the ratio of how far the label should be positioned from the border in the header area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23ratio">Online Documentation</a>
   */
  open var ratio: Double
  
  /**
   * Gets or sets a value indicating whether to use the [global padding][IStripe] or the normal [padding][IStripe] of a stripe for centering the label inside the stripe header area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23useTotalPadding">Online Documentation</a>
   */
  open var useTotalPadding: Boolean
  
  /**
   * Creates the parameter for the given position.
   * @param [position] The position.
   * @return The parameter for the given position.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23StripeLabelModel-method-createParameter">Online Documentation</a>
   */
  open fun createParameter(
    position: StripeLabelModelPosition,
  ): StripeLabelModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23StripeLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * Calculates the geometry in the form of an [IOrientedRectangle] for a given label using the given model parameter.
   * @param [label] the label to calculate the geometry for
   * @param [layoutParameter] A parameter that has been created by this model. This is typically the parameter that yielded this instance through its [model][ILabelModelParameter] property.
   * @return An instance that describes the geometry. This is typically an instance designed as a flyweight, so clients should not cache the instance but store the values if they need a snapshot for later use
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23StripeLabelModel-method-getGeometry">Online Documentation</a>
   */
  final override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<StripeLabelModel> {
    /**
     * A predefined parameter instance that places a label inside the bottom header of a column.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23BOTTOM">Online Documentation</a>
     */
     val BOTTOM: StripeLabelModelParameter
    
    /**
     * A predefined parameter instance that places a label inside the left header of a row.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23LEFT">Online Documentation</a>
     */
     val LEFT: StripeLabelModelParameter
    
    /**
     * A predefined parameter instance that places a label inside the right header of a row.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23RIGHT">Online Documentation</a>
     */
     val RIGHT: StripeLabelModelParameter
    
    /**
     * A predefined parameter instance that places a label inside the top header of a column.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModel%23TOP">Online Documentation</a>
     */
     val TOP: StripeLabelModelParameter
  }
}

inline fun StripeLabelModel(
    block: StripeLabelModel.() -> Unit
): StripeLabelModel {
    return StripeLabelModel()
        .apply(block)
}
