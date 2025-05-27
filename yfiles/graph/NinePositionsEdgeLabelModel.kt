// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An edge label model that places labels at positions near the source port, target port, or the center of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NinePositionsEdgeLabelModel] class.
 * @param [distance] The distance.
 * @param [angle] The angle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23NinePositionsEdgeLabelModel-constructor-NinePositionsEdgeLabelModel">Online Documentation</a>
 * 
 * @property distance
 * Gets or sets the distance of the labels above or below the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23distance">Online Documentation</a>
 * 
 * @property angle
 * Gets or sets the angle for the rotation of the labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23angle">Online Documentation</a>
 */
external open class NinePositionsEdgeLabelModel  (
open var distance: Double = definedExternally,
open var angle: Double = definedExternally) : ILabelModel, ILabelModelParameterProvider {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23NinePositionsEdgeLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Create a model parameter for the specified `position`
 * @param [position] The position for this parameter
 * @return a model parameter for the specified `position`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23NinePositionsEdgeLabelModel-method-createParameter">Online Documentation</a>
 */
 open   fun createParameter( position: NinePositionsEdgeLabelModelPosition ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23NinePositionsEdgeLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23NinePositionsEdgeLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23NinePositionsEdgeLabelModel-method-getParameters">Online Documentation</a>
 */
 override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23NinePositionsEdgeLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<NinePositionsEdgeLabelModel> {
/**
 * A predefined parameter instance that places the label at the center above the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23CENTER_ABOVE">Online Documentation</a>
 */
 val CENTER_ABOVE: ILabelModelParameter
/**
 * A predefined parameter instance that places the label at the center below the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23CENTER_BELOW">Online Documentation</a>
 */
 val CENTER_BELOW: ILabelModelParameter
/**
 * A predefined parameter instance that places the label at the center on the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23CENTER_CENTERED">Online Documentation</a>
 */
 val CENTER_CENTERED: ILabelModelParameter
/**
 * A predefined parameter instance that places the label at the source port above the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23SOURCE_ABOVE">Online Documentation</a>
 */
 val SOURCE_ABOVE: ILabelModelParameter
/**
 * A predefined parameter instance that places the label at the source port below the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23SOURCE_BELOW">Online Documentation</a>
 */
 val SOURCE_BELOW: ILabelModelParameter
/**
 * A predefined parameter instance that places the label at the source port on the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23SOURCE_CENTERED">Online Documentation</a>
 */
 val SOURCE_CENTERED: ILabelModelParameter
/**
 * A predefined parameter instance that places the label at the target port above the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23TARGET_ABOVE">Online Documentation</a>
 */
 val TARGET_ABOVE: ILabelModelParameter
/**
 * A predefined parameter instance that places the label at the target port below the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23TARGET_BELOW">Online Documentation</a>
 */
 val TARGET_BELOW: ILabelModelParameter
/**
 * A predefined parameter instance that places the label at the target port on the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModel%23TARGET_CENTERED">Online Documentation</a>
 */
 val TARGET_CENTERED: ILabelModelParameter
}
}

inline fun NinePositionsEdgeLabelModel(
    block: NinePositionsEdgeLabelModel.() -> Unit
): NinePositionsEdgeLabelModel {
    return NinePositionsEdgeLabelModel()
        .apply(block)
}
