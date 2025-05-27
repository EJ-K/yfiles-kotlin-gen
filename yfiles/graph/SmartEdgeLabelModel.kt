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
 * An edge label model that allows the placement at any position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-constructor-SmartEdgeLabelModel">Online Documentation</a>
 */
external open class SmartEdgeLabelModel  () : ILabelModel, ILabelModelParameterFinder {

/**
 * Gets or sets the rotation angle of all labels with this model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23angle">Online Documentation</a>
 */
open var angle: Double
/**
 * Gets or sets whether or not edge labels are automatically rotated according to the angle of the corresponding reference edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23autoRotation">Online Documentation</a>
 */
open var autoRotation: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates a parameter that measures the provided segment index from the source side of the edge path.
 * @param [segmentIndex] The zero-based index of the segment beginning from the source side.
 * @param [distance] The distance between the label's box and the edge's path. The default is 0.
 * @param [segmentRatio] The ratio at which to place the label at the segment. A ratio of `0.0` will place the label at the source side of the segment, a ratio of `1.0` at the target side. Ratios less than `0.0` or greater than `1.0` will be interpreted as absolute values in world coordinates. The default is 0.5.
 * @return A label parameter that describes the provided parameters for this model instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-method-createParameterFromSource">Online Documentation</a>
 */
 final   fun createParameterFromSource( segmentIndex: Int ,
 distance: Double  = definedExternally,
 segmentRatio: Double  = definedExternally):ILabelModelParameter
/**
 * Creates a parameter that measures the provided segment index from the target side of the edge path.
 * @param [segmentIndex] The zero-based index of the segment beginning from the target side.
 * @param [distance] The distance between the label's box and the edge's path. The default is 0.
 * @param [segmentRatio] The ratio at which to place the label at the segment. A ratio of `0.0` will place the label at the target side of the segment, a ratio of `1.0` at the source side. Ratios less than `0.0` or greater than `1.0` will be interpreted as absolute values in world coordinates. The default is 0.5.
 * @return A label parameter that describes the provided parameters for this model instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-method-createParameterFromTarget">Online Documentation</a>
 */
 final   fun createParameterFromTarget( segmentIndex: Int ,
 distance: Double  = definedExternally,
 segmentRatio: Double  = definedExternally):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-method-findBestParameter">Online Documentation</a>
 */
 final override   fun findBestParameter( label: ILabel ,
 model: ILabelModel ,
 layout: IOrientedRectangle ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * Gets the distance from the edge path described by the specified parameter.
 * @param [layoutParameter] The parameter to get the edge path distance for.
 * @return The distance from the edge path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-method-getDistance">Online Documentation</a>
 */
 final   fun getDistance( layoutParameter: ILabelModelParameter ):Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmartEdgeLabelModel%23SmartEdgeLabelModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<SmartEdgeLabelModel> {
}
}

inline fun SmartEdgeLabelModel(
    block: SmartEdgeLabelModel.() -> Unit
): SmartEdgeLabelModel {
    return SmartEdgeLabelModel()
        .apply(block)
}
