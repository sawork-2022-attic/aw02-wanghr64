# 代码理解
## `model` 部分
### `Cart`
`@Data`
- 一个 `item` 的 `List`
- `toString`

### `Item`
`@Data`
`@AllArgsConstructor`
- `Product` 的引用
- `amount` 的整型变量
- `toString`

### `Product`
`@Data`
`@AllArgsConstructor`
- `id`
- `name`
- `price`
- `toString`

## `db` 部分
- `product` 的 `List`
- `saveChart`
- `getChart`
- 根据 `productId` 来 `getProduct`

## `cli` 部分
`@ShellComponent`
- `PosService` 的引用
- `@Autowired` 的 setter
### `@ShellMethod`
- `value` 和 `key`
- `String` 返回值
- 参数

## `biz` 部分
`PosService`、具体实现

