// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An edge label model that allows placement of labels relative to an edge segment for bezier edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a default instance of the label model with no angle, auto ratio enabled and snapping disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23BezierEdgeSegmentLabelModel-constructor-BezierEdgeSegmentLabelModel">Online Documentation</a>
 */
external open class BezierEdgeSegmentLabelModel  () : ILabelModel, ILabelModelParameterFinder {

/**
 * Gets or sets the rotation angle of all labels with this model in radians.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23angle">Online Documentation</a>
 */
final var angle: Double
/**
 * Gets or sets whether or not edge labels are automatically rotated according to the tangent of the corresponding reference edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23autoRotation">Online Documentation</a>
 */
final var autoRotation: Boolean
/**
 * Gets or sets whether the model should snap automatically the layout center to the edge path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23autoSnapping">Online Documentation</a>
 */
final var autoSnapping: Boolean
/**
 * Creates a parameter at middle of the first segment directly on the path.
 * @return A parameter at middle of the first segment directly on the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23BezierEdgeSegmentLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates a parameter at the given segment measured from the source side of the edge path, segment ratio and distance from the segment.
 * @param [segmentIndex] The segment index. If this value is negative, placement outside of the edge path is assumed.
 * @param [segmentRatio] The ratio at which to place the label at the segment. A ratio of `0.0` will place the label at the source side of the segment, a ratio of `1.0` at the target side. Ratios are interpreted as parameter values of a cubic spline, i.e. not as percentages of the segment length. If the index is `-1`, ratios are interpreted as absolute values instead. The default is `0.5`.
 * @param [distance] The distance from the segment. This may be interpreted differently, depending on whether [autoSnapping] is enabled or not.
 * @return A new parameter with the given specification.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23BezierEdgeSegmentLabelModel-method-createParameterFromSource">Online Documentation</a>
 */
 final   fun createParameterFromSource( segmentIndex: Int ,
 segmentRatio: Double  = definedExternally,
 distance: Double  = definedExternally):ILabelModelParameter
/**
 * Creates a parameter at the given segment measured from the target side of the edge path, segment ratio and distance from the segment.
 * @param [segmentIndex] The segment index. If this value is negative, placement outside of the edge path is assumed.
 * @param [segmentRatio] The ratio at which to place the label at the segment. A ratio of `0.0` will place the label at the target side of the segment, a ratio of `1.0` at the source side. Ratios are interpreted as parameter values of a cubic spline, i.e. not as percentages of the segment length. If the index is `-1`, ratios are interpreted as absolute values instead. The default is `0.5.`
 * @param [distance] The distance from the segment. This may be interpreted differently, depending on whether [autoSnapping] is enabled or not.
 * @return A new parameter with the given specification.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23BezierEdgeSegmentLabelModel-method-createParameterFromTarget">Online Documentation</a>
 */
 final   fun createParameterFromTarget( segmentIndex: Int ,
 segmentRatio: Double  = definedExternally,
 distance: Double  = definedExternally):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23BezierEdgeSegmentLabelModel-method-findBestParameter">Online Documentation</a>
 */
 final override   fun findBestParameter( label: ILabel ,
 model: ILabelModel ,
 layout: IOrientedRectangle ):ILabelModelParameter
/**
 * Returns an empty context.
 * @param [label] The label to use in the context.
 * @param [layoutParameter] The parameter to use for the label in the context.
 * @return An empty context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23BezierEdgeSegmentLabelModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23BezierEdgeSegmentLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeSegmentLabelModel%23BezierEdgeSegmentLabelModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<BezierEdgeSegmentLabelModel> {
}
}

inline fun BezierEdgeSegmentLabelModel(
    block: BezierEdgeSegmentLabelModel.() -> Unit
): BezierEdgeSegmentLabelModel {
    return BezierEdgeSegmentLabelModel()
        .apply(block)
}
