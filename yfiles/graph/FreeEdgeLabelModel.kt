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
 * An edge label model that can be used to describe any position and orientation of a label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a [FreeEdgeLabelModel] with the default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23FreeEdgeLabelModel-constructor-FreeEdgeLabelModel">Online Documentation</a>
 */
external open class FreeEdgeLabelModel  () : ILabelModelParameterFinder, ILabelModel {

/**
 * Gets or sets a property that indicates whether the angle used by the [parameter][createEdgeAnchored] should be interpreted relative to the edge's orientation or as an absolute angle in the coordinate system.
 * 
 * By default the angle is interpreted to be relative to the world coordinates axes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23edgeRelativeAngle">Online Documentation</a>
 */
open var edgeRelativeAngle: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23FreeEdgeLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates a parameter for the given location.
 * @param [ratio] The ratio at which the label will be anchored between the location of the source port and the location of the target port. The default is 0.5.
 * @param [distance] The distance orthogonally to the connection between the source and target point. The default is 0.
 * @param [angle] The angle by which the label should be rotated. The default is 0.
 * @return A parameter that describes the position.
 * @see [edgeRelativeAngle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23FreeEdgeLabelModel-method-createEdgeAnchored">Online Documentation</a>
 */
 final   fun createEdgeAnchored( ratio: Double  = definedExternally,
 distance: Double  = definedExternally,
 angle: Double  = definedExternally):ILabelModelParameter
/**
 * Tries to find a parameter that best matches the given layout for the provided label instance.
 * @param [label] The label to find a parameter for.
 * @param [model] The model instance to use. This should be this instance.
 * @param [layout] The anticipated layout for the label.
 * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23FreeEdgeLabelModel-method-findBestParameter">Online Documentation</a>
 */
 final override   fun findBestParameter( label: ILabel ,
 model: ILabelModel ,
 layout: IOrientedRectangle ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23FreeEdgeLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23FreeEdgeLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23FreeEdgeLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<FreeEdgeLabelModel> {
/**
 * A shared unmodifiable public instance that can be used to obtain parameters.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelModel%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: FreeEdgeLabelModel
}
}

inline fun FreeEdgeLabelModel(
    block: FreeEdgeLabelModel.() -> Unit
): FreeEdgeLabelModel {
    return FreeEdgeLabelModel()
        .apply(block)
}
