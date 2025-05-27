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
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A label model for stripe labels which supports the possible header positions of [IRow]s and [IColumn]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this model with empty insets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-constructor-StretchStripeLabelModel">Online Documentation</a>
 */
external open class StretchStripeLabelModel  () : ILabelModel, ILabelModelParameterProvider {

/**
 * Gets or sets the insets to use within the stripe's [IStripe.layout].
 * 
 * The default is `(0,0,0,0)`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23insets">Online Documentation</a>
 */
open var insets: Insets
/**
 * Gets or sets a value indicating whether to use the [actual insets][IStripe.actualInsets] or the normal [IStripe.insets] of a stripe for centering the label inside the stripe header area.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23useActualInsets">Online Documentation</a>
 */
open var useActualInsets: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates the parameter for the given position.
 * @param [position] The position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-createParameter">Online Documentation</a>
 */
 open   fun createParameter( position: StretchStripeLabelModelPosition ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * Calculates the geometry in form of an [IOrientedRectangle] for a given label using the given model parameter.
 * @param [label] the label to calculate the geometry for
 * @param [layoutParameter] A parameter that has been created by this model. This is typically the parameter that yielded this instance through its [ILabelModelParameter.model] property.
 * @return An instance that describes the geometry. This is typically an instance designed as a flyweight, so clients should not cache the instance but store the values if they need a snapshot for later use
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-getParameters">Online Documentation</a>
 */
 override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23StretchStripeLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<StretchStripeLabelModel> {
/**
 * A predefined parameter instance that places a label inside the right header of a row.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23EAST">Online Documentation</a>
 */
 val EAST: ILabelModelParameter
/**
 * A predefined parameter instance that places a label inside the top header of a column.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23NORTH">Online Documentation</a>
 */
 val NORTH: ILabelModelParameter
/**
 * A predefined parameter instance that places a label inside the bottom header of a column.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23SOUTH">Online Documentation</a>
 */
 val SOUTH: ILabelModelParameter
/**
 * A predefined parameter instance that places a label inside the left header of a row.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModel%23WEST">Online Documentation</a>
 */
 val WEST: ILabelModelParameter
}
}

inline fun StretchStripeLabelModel(
    block: StretchStripeLabelModel.() -> Unit
): StretchStripeLabelModel {
    return StretchStripeLabelModel()
        .apply(block)
}
