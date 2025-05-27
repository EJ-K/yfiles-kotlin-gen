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
 * An edge label model that allows placement of labels along the edge path at a set of continuous positions at specified [sides of the edge path][EdgePathLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [EdgePathLabelModel] class.
 * @param [distance] The distance to the edge.
 * @param [offset] The offset to the default placement.
 * @param [angle] The angle of the label's rotation in radians.
 * @param [autoRotation] If set to `true` auto rotation is enabled.
 * @param [sideOfEdge] The side of the edge labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23EdgePathLabelModel-constructor-EdgePathLabelModel">Online Documentation</a>
 * 
 * @property distance
 * Gets or sets the distance between the label box and the edge path.
 * @see [sideOfEdge]
 * @see [EdgeSides]
 * @see [offset]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23distance">Online Documentation</a>
 * 
 * @property offset
 * Gets or sets the offset of the label box and the edge path relative to the default placement.
 * @see [sideOfEdge]
 * @see [EdgeSides]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23offset">Online Documentation</a>
 * 
 * @property angle
 * Gets or sets the rotation angle of all labels with this model in radians.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23angle">Online Documentation</a>
 * 
 * @property autoRotation
 * Gets or sets whether edge labels are automatically rotated according to the angle of the corresponding reference edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23autoRotation">Online Documentation</a>
 * 
 * @property sideOfEdge
 * Gets or sets the side placement specifiers for edge labels.
 * @see [EdgeSides]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23sideOfEdge">Online Documentation</a>
 */
external class EdgePathLabelModel (
final var distance: Double = definedExternally,
final var offset: Double = definedExternally,
final var angle: Double = definedExternally,
final var autoRotation: Boolean = definedExternally,
final var sideOfEdge: EdgeSides = definedExternally) : ILabelModel {
  /**
   * Creates a parameter at the provided edge path ratio.
   * @param [edgePathRatio] The ratio at which to place the label at the edge path. A ratio of 0.0 will place the label at the source side of the edge path, a ratio of 1.0 at the target side. The default is 0.5.
   * @param [sideOfEdge] The side of the edge the label is placed on. Note that only single enum values but no combined ones are allowed. The default is [ON_EDGE][EdgeSides].
   * @return A label parameter at the provided edge path ratio for this model instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23EdgePathLabelModel-method-createRatioParameter">Online Documentation</a>
   */
  fun createRatioParameter(
    edgePathRatio: Double  = definedExternally,
    sideOfEdge: EdgeSides  = definedExternally,
  ): EdgePathLabelModelParameter
  
  /**
   * Tries to find a parameter that best matches the given layout for the provided label instance.
   * @param [label] The label to find a parameter for.
   * @param [layout] The anticipated layout for the label.
   * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23EdgePathLabelModel-method-findBestParameter">Online Documentation</a>
   */
  fun findBestParameter(
    label: ILabel,
    layout: IOrientedRectangle,
  ): ILabelModelParameter
  
  /**
   * Returns an empty context.
   * @param [label] The label to use in the context.
   * @return An empty context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23EdgePathLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathLabelModel%23EdgePathLabelModel-method-getGeometry">Online Documentation</a>
   */
  override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<EdgePathLabelModel> {
  }
}

inline fun EdgePathLabelModel(
    block: EdgePathLabelModel.() -> Unit
): EdgePathLabelModel {
    return EdgePathLabelModel()
        .apply(block)
}
