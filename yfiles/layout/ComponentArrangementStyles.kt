// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.YFlags

/**
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles">Online Documentation</a>
 */
external class ComponentArrangementStyles 
    private constructor(): YFlags<ComponentArrangementStyles> {
    companion object {
    /**
 * Style specifier describing no special component arrangement at all.
 * 
 * Value - `0`
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23NONE">Online Documentation</a>
 */
val NONE: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places components in multiple rows so that the overall aspect ratio of the whole graph gets as close to the aspect ratio of the preferred layout size as possible.
 * 
 * Value - `1`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23ROWS">Online Documentation</a>
 */
val ROWS: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places all components next to each other in a single row.
 * 
 * Value - `2`
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23SINGLE_ROW">Online Documentation</a>
 */
val SINGLE_ROW: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places components above each other in a single column.
 * 
 * Value - `3`
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23SINGLE_COLUMN">Online Documentation</a>
 */
val SINGLE_COLUMN: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places components in a rectangular cloud around the biggest component.
 * 
 * Value - `4`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23PACKED_RECTANGLE">Online Documentation</a>
 */
val PACKED_RECTANGLE: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places components in a rectangular cloud around the biggest component.
 * 
 * Value - `5`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23PACKED_COMPACT_RECTANGLE">Online Documentation</a>
 */
val PACKED_COMPACT_RECTANGLE: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places components in a circular cloud around the biggest component.
 * 
 * Value - `6`
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23PACKED_CIRCLE">Online Documentation</a>
 */
val PACKED_CIRCLE: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places components in a circular compact cloud around the biggest component.
 * 
 * Value - `7`
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23PACKED_COMPACT_CIRCLE">Online Documentation</a>
 */
val PACKED_COMPACT_CIRCLE: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places components in multiple rows.
 * 
 * Value - `8`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MULTI_ROWS">Online Documentation</a>
 */
val MULTI_ROWS: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places components in multiple rows.
 * 
 * Value - `9`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MULTI_ROWS_COMPACT">Online Documentation</a>
 */
val MULTI_ROWS_COMPACT: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places the components in [MULTI_ROWS] with a restricted height.
 * 
 * Value - `10`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MULTI_ROWS_HEIGHT_CONSTRAINT">Online Documentation</a>
 */
val MULTI_ROWS_HEIGHT_CONSTRAINT: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places the components in [MULTI_ROWS] with a restricted height and as compact as possible.
 * 
 * Value - `11`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MULTI_ROWS_HEIGHT_CONSTRAINT_COMPACT">Online Documentation</a>
 */
val MULTI_ROWS_HEIGHT_CONSTRAINT_COMPACT: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places the components in [MULTI_ROWS] with a restricted width.
 * 
 * Value - `12`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MULTI_ROWS_WIDTH_CONSTRAINT">Online Documentation</a>
 */
val MULTI_ROWS_WIDTH_CONSTRAINT: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places the components in [MULTI_ROWS] with a restricted width and as compact as possible.
 * 
 * Value - `13`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MULTI_ROWS_WIDTH_CONSTRAINT_COMPACT">Online Documentation</a>
 */
val MULTI_ROWS_WIDTH_CONSTRAINT_COMPACT: ComponentArrangementStyles
/**
 * Style specifier describing a component arrangement strategy that places the components in multiple nested rows, like [MULTI_ROWS], but separates components of different [node type][LayoutKeys.NODE_TYPE_DP_KEY].
 * 
 * Value - `14`
 * @see [ComponentLayout.style]
 * @see [ComponentLayout.preferredSize]
 * @see [LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MULTI_ROWS_TYPE_SEPARATED">Online Documentation</a>
 */
val MULTI_ROWS_TYPE_SEPARATED: ComponentArrangementStyles
/**
 * A constant for masking actual style constants from style modifiers.
 * 
 * Value - `31`
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MASK">Online Documentation</a>
 */
val MASK: ComponentArrangementStyles
/**
 * A modifier that can be added to normal style specifiers to indicate that the arrangement strategy should take the initial positions of the components into account.
 * 
 * Value - `32`
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MODIFIER_AS_IS">Online Documentation</a>
 */
val MODIFIER_AS_IS: ComponentArrangementStyles
/**
 * A modifier that can be added to normal style specifiers to indicate that the arrangement strategy should produce a non-overlapping component layout.
 * 
 * Value - `64`
 * @see [ComponentLayout.style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementStyles%23MODIFIER_NO_OVERLAP">Online Documentation</a>
 */
val MODIFIER_NO_OVERLAP: ComponentArrangementStyles

    }
}
