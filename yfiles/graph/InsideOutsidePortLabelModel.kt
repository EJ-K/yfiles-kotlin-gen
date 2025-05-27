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
 * A label model for labels at node ports which places the label either inside or outside of the owner node of the port, according to the node border that is closest to the port position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsideOutsidePortLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this model with default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsideOutsidePortLabelModel%23InsideOutsidePortLabelModel-constructor-InsideOutsidePortLabelModel">Online Documentation</a>
 */
external class InsideOutsidePortLabelModel () : ILabelModel {
  /**
   * Gets or sets the distance between the owner [IPort] and the closest border of the [ILabel].
   * 
   * The default value is 5.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsideOutsidePortLabelModel%23distance">Online Documentation</a>
   */
  final var distance: Double
  
  /**
   * Creates a parameter which places the label inside of the [IPort]'s owner node.
   * @return A parameter which places the label inside of the [IPort]'s owner node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsideOutsidePortLabelModel%23InsideOutsidePortLabelModel-method-createInsideParameter">Online Documentation</a>
   */
  fun createInsideParameter(): InsideOutsidePortLabelModelParameter
  
  /**
   * Creates a parameter which places the label outside of the [IPort]'s owner node.
   * @return A parameter which places the label outside of the [IPort]'s owner node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsideOutsidePortLabelModel%23InsideOutsidePortLabelModel-method-createOutsideParameter">Online Documentation</a>
   */
  fun createOutsideParameter(): InsideOutsidePortLabelModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsideOutsidePortLabelModel%23InsideOutsidePortLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InsideOutsidePortLabelModel%23InsideOutsidePortLabelModel-method-getGeometry">Online Documentation</a>
   */
  override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<InsideOutsidePortLabelModel> {
  }
}

inline fun InsideOutsidePortLabelModel(
    block: InsideOutsidePortLabelModel.() -> Unit
): InsideOutsidePortLabelModel {
    return InsideOutsidePortLabelModel()
        .apply(block)
}
