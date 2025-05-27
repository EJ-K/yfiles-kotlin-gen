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
 * An edge label model that allows placement of labels along the edge path for bezier edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a default instance of the label model with no angle, auto ratio enabled, and snapping disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel%23BezierEdgePathLabelModel-constructor-BezierEdgePathLabelModel">Online Documentation</a>
 */
external class BezierEdgePathLabelModel () : ILabelModel {
  /**
   * Gets or sets the rotation angle of all labels with this model in radians.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel%23angle">Online Documentation</a>
   */
  final var angle: Double
  
  /**
   * Gets or sets whether or not edge labels are automatically rotated according to the tangent of the corresponding reference edge segment.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel%23autoRotation">Online Documentation</a>
   */
  final var autoRotation: Boolean
  
  /**
   * Gets or sets whether the model should snap automatically the layout center to the edge path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel%23autoSnapping">Online Documentation</a>
   */
  final var autoSnapping: Boolean
  
  /**
   * Creates a parameter at the provided edge path ratio.
   * @param [ratio] The cubic ratio on the segment
   * @param [distance] The distance from the segment. This may be interpreted differently, depending on whether [autoSnapping][BezierEdgePathLabelModel] is enabled or not.
   * @param [absolute] Whether the ratio should be interpreted as the ratio between the source and target ports of the edge. Default is false.
   * @return A new parameter with the given specification.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel%23BezierEdgePathLabelModel-method-createParameter">Online Documentation</a>
   */
  fun createParameter(
    ratio: Double,
    distance: Double  = definedExternally,
    absolute: Boolean  = definedExternally,
  ): BezierEdgePathLabelModelParameter
  
  /**
   * Tries to find a parameter that best matches the given layout for the provided label instance.
   * @param [label] The label to find a parameter for.
   * @param [layout] The anticipated layout for the label.
   * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel%23BezierEdgePathLabelModel-method-findBestParameter">Online Documentation</a>
   */
  fun findBestParameter(
    label: ILabel,
    layout: IOrientedRectangle,
  ): ILabelModelParameter
  
  /**
   * Returns an empty context.
   * @param [label] The label to use in the context.
   * @return An empty context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel%23BezierEdgePathLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgePathLabelModel%23BezierEdgePathLabelModel-method-getGeometry">Online Documentation</a>
   */
  override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<BezierEdgePathLabelModel> {
  }
}

inline fun BezierEdgePathLabelModel(
    block: BezierEdgePathLabelModel.() -> Unit
): BezierEdgePathLabelModel {
    return BezierEdgePathLabelModel()
        .apply(block)
}
